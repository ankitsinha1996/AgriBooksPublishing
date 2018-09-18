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
        <link href="css/font-awesome.min.css" rel="stylesheet"> 
        <link href="css/home.css" rel="stylesheet">

        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

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

        <div class=" well">
            <form action="AddManuscript" method="post">
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
                                        <option value="<c:out value="${category.getCategoryId()}"></c:out>">
                                            <c:out value="${category.getCategoryName()}"></c:out>
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
                                <select name="authorId">

                                    <option value="0">
                                        --Select a Author--
                                    </option>
                                    <c:forEach items="${myAuthorList}" var="author">
                                        <option value="<c:out value="${author.getAuthorId()}"></c:out>">
                                            <c:out value="${author.getAuthor_name()}"></c:out>
                                            </option>
                                    </c:forEach>
                                </select>  
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
                                <font size="6" color="Yellow">Expected Price :</font>
                            </td>
                            <td>
                                <input type="text" name="expectedPrice" value=""> 
                            </td>
                        </tr>

                    </tbody>
                </table>
                <br>
                <center>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;


                    <input type="submit" value="Next" class="btn-primary">

                </center>

            </form>
        </div>


    </body>
</html>