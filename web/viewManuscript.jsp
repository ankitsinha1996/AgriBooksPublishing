<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="images/logo.jpg">

        <title>AGRI-Books Publishing House</title>

        <!-- Bootstrap core CSS -->
        <link href="bootstraps/dist/css/bootstrap.min.css" rel="stylesheet">

        <link href="css/font.css" rel="stylesheet"> 
        <link href="css/home.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet"> 

        <script>
            function downloadFile(fileToDownload)
            {
                alert(fileToDownload);
                var hiddenIFrameId = 'hiddenDownloader';
                iframe = document.getElementById(hiddenIFrameId);
                if(iframe==null)
                {
                    iframe=document.createElement('iframe');
                    iframe.id=hiddenIFrameId;
                    iframe.style.display='visible';
                    document.body.appendChild(iframe);
                }
                console.log(fileToDownload);
                iframe.src=fileToDownload;
            }
        </script>


    </head>
    <body class="corn" style="background-image: url('images/editor.jpg')" width= '1366' height= '768'>

        <nav class="navbar navbar-toggleable-md navbar-inverse fixed-top bg-inverse">
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="#">

                <img src="images/logo.jpg" height="35" width="50">

            </a>
            <a class="navbar-brand" href="#">AGRI-Books</a>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="homepage.jsp">Home <span class="sr-only">(current)</span></a>
                    </li>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <!--                    <li class="nav-item active">
                                            <a class="nav-link" href="#">View Manuscript</a>
                                        </li>
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
                    <!--                    <li class="nav-item active">
                                            <a class="nav-link" href="#">Upload Manuscript</a>
                                        </li>
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
                    <li class="nav-item active">
                        <a class="nav-link" href="login.jsp">Logout</a>
                    </li>
                </ul>
                <form class="form-inline mt-2 mt-md-0" >
                    <input class="form-control mr-sm-2" type="text" placeholder="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>
        <div class="well">
            <form action="ShowViewManuscriptForm" method="post">
                <br>
                <table class="table table-hover">            
                    <tbody>
                        <tr>
                            <td>
                                <FONT SIZE="5" color="white">Book Category :</FONT>
                            </td>
                            <td>

                                <select name="category" onchange="this.form.submit();">

                                    <option value="0">
                                        --Select a Category--
                                    </option>
                                    <c:forEach items="${myCategoryList}" var="category">
                                        <option value="<c:out value="${category.getCategoryId()}"></c:out>"                                                 
                                                <c:if test="${category.getCategoryId()==categoryId_selected}">selected</c:if>                                                
                                                >
                                            <c:out value="${category.getCategoryName()}"></c:out>
                                            </option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <FONT SIZE="5" color="white">Author :</FONT>
                            </td>
                            <td>
                                <select name="authorId" onchange="this.form.submit();">
                                    <option value="0">
                                        --Select a author--
                                    </option>
                                    <c:forEach items="${myAuthorList}" var="author">
                                        <option value="<c:out value="${author.getAuthorId()}"></c:out>" 
                                                <c:if test="${author.getAuthorId()==authorId_selected}">selected</c:if>                                                
                                                >
                                            <c:out value="${author.getAuthor_name()}"></c:out>
                                            </option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <FONT SIZE="5" color="white">Book :</FONT>
                            </td>
                            <td>
                                <select name="serialNum" onchange="this.form.submit();">
                                    <option value="0">
                                        --Select a book--
                                    </option>
                                    <c:forEach items="${myBookList}" var="book">

                                        <option value="<c:out value="${book.getSerialNum()}"></c:out>"
                                                <c:if test="${book.getSerialNum()==serialNum_selected}"> selected</c:if>
                                                    >
                                                <c:out value="${book.getBookTitle()}"></c:out>
                                                </option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr> 
                        <tr>
                            <td>
                                <FONT SIZE="5" color="white">Manuscript :</FONT>
                            </td>
                            <td>
                                <select name="manuscript" onchange="downloadFile(this.value);">
                                    <option value="0">
                                        --Select a Manuscript--
                                    </option>
                                    <c:forEach items="${myManuscriptList}" var="book">

                                        <option value="<c:out value="${book.getManuscript()}"></c:out>"
                                                <c:if test="${book.getSerialNum()== manusript_selected}"> selected</c:if>
                                                    >
                                                <c:out value="${book.getManuscript()}"></c:out>
                                                </option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>              
                        <tr>
                            <td>                        
                                <br>
                                <br>
                                <br>
                                <input type="submit" value="Download" class="btn-primary">
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html>