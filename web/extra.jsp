<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="images/logo.jpg">

        <title>AGRI-Books Publishing House</title>

        <!-- Bootstrap core CSS -->
        <link href="bootstraps/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font.css" rel="stylesheet"> 
        <link href="css/font-awesome.min.css" rel="stylesheet"> 
        <link href="css/home.css" rel="stylesheet">

        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


        <script>

            function showButton()
            {
                document.getElementById("save_button").style.visible='display';
            }

        </script>

    </head>
    <body class="corn" style="background-image: url('images/author.jpg')" width="1366" height="768">

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
        <br>
        <br>
        <form action="AddManuscript" method="post">
            <div class=" well">

                <table class="table table-hover">
                    <tbody>
                        <tr>
                            <td>
                                <font size="6" color="Yellow">Book Category:</font>
                            </td>
                            <td>

                                <select name="category">

                                    <option value="0">
                                        --Select a Category--
                                    </option>
                                    <c:forEach items="${myCategoryList}" var="category">
                                        <option value="<c:out value="${category.getCategory()}"></c:out>"
                                                <<option value="<c:out value="${category.getAuthor_name()}"></c:out> ">
                                            <c:out value="${category.getCategory()}"></c:out>
                                            </option>
                                    </c:forEach>
                                </select>                                    
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <font size="6" color="Yellow">Author:</font>
                            </td>
                            <td>
                                <input type="text" name="author_name" value=""> 
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <font size="6" color="Yellow">Book:</font>
                            </td>
                            <td>
                                <input type="text" name="bookTitle" value=""> 
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <font size="6" color="Yellow">Expected Price:</font>
                            </td>
                            <td>
                                <input type="text" name="expectedPrice" value=""> 
                            </td>
                        </tr>
                        <tr>
                            <td>
                                
                            </td>
                            <td>
                                <input type="submit" value="Add Manuscript" class="btn-primary" id="save_button" style="visibility: hidden">
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </form>
        <form action="AddManuscript" method="post" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>
                        <font size="6" color="Yellow">Upload Manuscript:</font>
                    </td>
                    <td>

                        <input type="file" name="manuscriptFilePath">                       
                    </td>
                    <td>

                        <input type="submit" value="Upload File" class="btn-primary" onclick="showButton()">                     
                    </td>
                </tr>
            </table>
        </form>
    </tbody>
</table>


</center>
</div>


</body>
</html>