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
                <form class="form-inline mt-2 mt-md-0">
                    <input class="form-control mr-sm-2" type="text" placeholder="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>
        <div class="well">
            <form action="UploadEditorVersion" method="post">
                <br>
                <br>
                <br>
                <br>
                <table class="table table-hover">            
                    <tbody>
                        <tr>
                            <td>
                                <FONT SIZE="5" color="white">Book Category :</FONT>
                            </td>
                            <td>

                                <select name="editorId">
                                    <option value="0">
                                        --Select a category--
                                    </option>
                                    <c:forEach items="${myDeptList}" var="dept">

                                        <option value="<c:out value="${dept.getDepartmentId()}"></c:out>"
                                                <c:if test="${dept.getDepartmentId()== myDeveloper.getDepartmentId()}"> selected</c:if>
                                                    >
                                                <c:out value="${dept.getDepartmentName()}"></c:out>
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
                                <select name="editorId">
                                    <option value="0">
                                        --Select a author--
                                    </option>
                                    <c:forEach items="${myDeptList}" var="dept">

                                        <option value="<c:out value="${dept.getDepartmentId()}"></c:out>"
                                                <c:if test="${dept.getDepartmentId()== myDeveloper.getDepartmentId()}"> selected</c:if>
                                                    >
                                                <c:out value="${dept.getDepartmentName()}"></c:out>
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
                                <select name="editorId">
                                    <option value="0">
                                        --Select a book--
                                    </option>
                                    <c:forEach items="${myDeptList}" var="dept">

                                        <option value="<c:out value="${dept.getDepartmentId()}"></c:out>"
                                                <c:if test="${dept.getDepartmentId()== myDeveloper.getDepartmentId()}"> selected</c:if>
                                                    >
                                                <c:out value="${dept.getDepartmentName()}"></c:out>
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
                                <select name="editorId">
                                    <option value="0">
                                        --Select a Manuscript--
                                    </option>
                                    <c:forEach items="${myDeptList}" var="dept">

                                        <option value="<c:out value="${dept.getDepartmentId()}"></c:out>"
                                                <c:if test="${dept.getDepartmentId()== myDeveloper.getDepartmentId()}"> selected</c:if>
                                                    >
                                                <c:out value="${dept.getDepartmentName()}"></c:out>
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
                                <input type="submit" value="Upload Manuscript" class="btn-primary">
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html>