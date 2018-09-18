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
        <link href="css/home.css" rel="stylesheet">
        <link href="css/font.css" rel="stylesheet"> 
        <link href="css/font-awesome.min.css" rel="stylesheet"> 


    </head>
    <body class="corn" style="background-image: url('images/designer.jpg')">

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
                    <!--                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <li class="nav-item active">
                                            <a class="nav-link" href="#">Editors' Copy</a>
                                        </li>-->
                    <!--                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <li class="nav-item active">
                                            <a class="nav-link" href="#">Design and Discuss</a>
                                        </li>-->
                    <!--                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <li class="nav-item active">
                                            <a class="nav-link" href="#">Update Artwork</a>
                                        </li>-->
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
        <div class="well">
            <form action="EditorCopy" method="post">
                <table class="table table-hover">
                    <tbody>
                    <br>
                    <br>
                    <tr>
                        <td>
                            <FONT SIZE=5 COLOR="white" >Category:
                        </td>
                        <td>
                            <select name="departmentId">
                                <option value="0">
                                    --Select a Category--
                                </option>
                                <c:forEach items="${myDeptList}" var="dept">

                                    <option value="<c:out value="${dept.getDepartmentId()}"></c:out>" 
                                            <c:if test="${dept.getDepartmentId()== myDeveloper.getDepartmentId()}"> selected</c:if>
                                                >
                                            <c:out value="${dept.getDepartmentName()}"></c:out>
                                            </option> 
                                </c:forEach>          
                            </select>
                        <!--<input type="text" name="departmentId" value="<c:out value="${myDeveloper.getDepartmentName()}"></c:out> ">-->

                            </td>
                        </tr>
                        <tr>
                            <td>
                                <FONT SIZE=5 COLOR="white" >Author Name:
                            </td>
                            <td>
                                <select name="departmentId">
                                    <option value="0">
                                        --Select Author Name--
                                    </option>
                                <c:forEach items="${myDeptList}" var="dept">

                                    <option value="<c:out value="${dept.getDepartmentId()}"></c:out>" 
                                            <c:if test="${dept.getDepartmentId()== myDeveloper.getDepartmentId()}"> selected</c:if>
                                                >
                                            <c:out value="${dept.getDepartmentName()}"></c:out>
                                            </option> 
                                </c:forEach>          
                            </select>
                        <!--<input type="text" name="departmentId" value="<c:out value="${myDeveloper.getDepartmentName()}"></c:out> ">-->

                            </td>
                        </tr>
                        <tr>
                            <td>
                                <FONT SIZE=5 COLOR="white" >Book:
                            </td>
                            <td>
                                <select name="departmentId">
                                    <option value="0">
                                        --Select a Book--
                                    </option>
                                <c:forEach items="${myDeptList}" var="dept">

                                    <option value="<c:out value="${dept.getDepartmentId()}"></c:out>" 
                                            <c:if test="${dept.getDepartmentId()== myDeveloper.getDepartmentId()}"> selected</c:if>
                                                >
                                            <c:out value="${dept.getDepartmentName()}"></c:out>
                                            </option> 
                                </c:forEach>          
                            </select>
                        <!--<input type="text" name="departmentId" value="<c:out value="${myDeveloper.getDepartmentName()}"></c:out> ">-->

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>

                            <input type="submit" value="Download Manuscript" class="btn-primary">
                        </td>

                    </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html>
