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
        <link rel="stylesheet" type="text/css" href="css/home.css">
        <link rel="stylesheet" type="text/css" href="css/font.css">
        
        <!-- Custom styles for this template -->
        <link href="bootstraps/docs/examples/carousel/carousel.css" rel="stylesheet">
    </head>
    <body style="background-image: url('images/background.jpg')">

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
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <li class="nav-item active">
                        <a class="nav-link" href="gallery.jsp">Gallery</a>
                    </li>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <li class="nav-item active">
                        <a class="nav-link" href="login.jsp">Login</a>
                    </li>
                    <!--          <li class="nav-item">
                                <a class="nav-link disabled" href="#">Disabled</a>
                              </li>-->
                </ul>
                <form class="form-inline mt-2 mt-md-0">
                    <input class="form-control mr-sm-2" type="text" placeholder="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>

        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="carousel-item active">
                    <img class="first-slide" src="images\firstslide.jpg" alt="First slide" height="550" width="1366">
                    <div class="container">
                        <div class="carousel-caption d-none d-md-block text-left">
                            <h1>Explore The KnowledgeHub.</h1>
                            <h3>One book, one pen, one child, and one teacher can change the world.</h3>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="second-slide" src="images\secondslide.jpg" alt="Second slide" height="550" width="1366">
                    <div class="container">
                        <div class="carousel-caption d-none d-md-block">
                            <h1>Knowledge of Agriculture</h1>
                            <h3>The discovery of agriculture was the first big step toward a civilized life.</h3>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="third-slide" src="images\thirdslide.jpg" alt="Third slide" height="550" width="1366">
                    <div class="container">
                        <div class="carousel-caption d-none d-md-block text-right">
                            <h1>Write Thoughts with Pen,Be an Author.</h1>
                            <p>To write what is worth publishing, to find honest people to publish it, and get sensible people to read it, are the three great difficulties in being an author</p>
                        </div>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>


        <!-- Marketing messaging and featurettes
        ================================================== -->
        <!-- Wrap the rest of the page in another container to center all the content. -->

        <div class="container marketing">

            <!-- Three columns of text below the carousel -->
            <div class="row">
                <div class="col-lg-4">
                    <img class="rounded-circle" src="images/bijoy.jpg" alt="Generic placeholder image" width="140" height="140">
                    <h2>Bijoy Debnath</h2>
                    <p>Developer & Designer</p>
                    <p><a class="btn btn-secondary" href="https://www.facebook.com/bijoy.debnath.7758" role="button">View details &raquo;</a></p>
                </div><!-- /.col-lg-4 -->
                <div class="col-lg-4">
                    <img class="rounded-circle" src="images/ankita.jpg" alt="Generic placeholder image" width="140" height="140">
                    <h2>Ankita Parui</h2>
                    <p>Coder</p>
                    <p><a class="btn btn-secondary" href="https://www.facebook.com/ankita.parui.3" role="button">View details &raquo;</a></p>
                </div><!-- /.col-lg-4 -->
                <div class="col-lg-4">
                    <img class="rounded-circle" src="images/ankit.png" alt="Generic placeholder image" width="140" height="140">
                    <h2>Ankit Sinha</h2>
                    <p>Coder</p>
                    <p><a class="btn btn-secondary" href="https://www.facebook.com/ankit.sinha.3192" role="button">View details &raquo;</a></p>
                </div><!-- /.col-lg-4 -->
            </div><!-- /.row -->


            <!-- START THE FEATURETTES -->

            <hr class="featurette-divider">

            <div class="row featurette">
                <div class="col-md-7">
                    <h2 class="featurette-heading">Food History Almanac 2 Volume Set.</h2><span class="text-muted"><h3>Over 1,300 Years of World Culinary History, Culture, and Social Influence</h3></span>
                    <p class="lead">The Food History Almanac covers 365 days of the year, with information and anecdotes relating to food history from around the world from medieval times to the present. The daily entries include such topics as celebrations; significant food-related moments in history from the fields of science and technology, exploration and discovery, travel, literature, hotel and restaurant history, and military history; menus from famous and infamous meals across a wide spectrum, from extravagant royal banquets to war rations and prison fare; birthdays of important people in the food field; and publication dates for important cookbooks and food texts and first known recipes. Food historian Janet Clarkson has drawn from her vast compendium of historical cookbooks, food texts, scholarly articles, journals, diaries, ships logs, letters, official reports, and newspaper and magazine articles to bring food history alive. History buffs, foodies, students doing reports, and curious readers will find it a constant delight. An introduction, list of recipes, selected bibliography, and set index, plus a number of period illustrations are added value.</p>
                </div>
                <div class="col-md-5">
                    <img src="images/book8.jpeg" height="500" width="400">
                </div>
            </div>

            <hr class="featurette-divider">

            <div class="row featurette">
                <div class="col-md-7 push-md-5">
                    <h2 class="featurette-heading">Feeding the World in the 21st Century.</h2><span class="text-muted"><h3>A Historical Analysis of Agriculture and Society</h3></span></h2>
                    <p class="lead">Agriculture has successfully managed to increase production faster than demand for nearly one and a half centuries, and agricultural policy has developed through times of impasse during this period. This book provides and utilizes a historical understanding of the current global food situation as the basis for analyzing the ultimate challenge on how to feed an ever-expanding world of 10 billion people.</p>
                </div>
                <div class="col-md-5 pull-md-7">
                    <img src="images/book9.jpeg" height="500" width="400">
                </div>
            </div>

            <hr class="featurette-divider">

            <div class="row featurette">
                <div class="col-md-7">
                    <h2 class="featurette-heading">And lastly, this one. <span class="text-muted">Checkmate.</span></h2>
                    <p class="lead">Indian agriculture has witnessed a remarkable progress during the past three decades. The Indian agriculture is standing at the cross roads because of the fast changing scenario in global economy of which Indian economy is an integrated part and agriculture continues to be backbone of Indian economy. The book discuss exhaustive studies on various aspects of agricultural sciences. The present book provides the state of agro-ecosystem vis-a-vis environment and outlines future directions so that sustainable agriculture is achieved without causing extensive damage to the fragile agro-ecosystem. The present book entitled Concept of Tropical Agriculture is the compilation of some most recent research articles of eminent scientists from different parts of the country. With its application-oriented and inter-disciplinary approach, the book would be immensely useful to everyone dealing with agriculture sciences, such as University teachers, farmers, academics, technocrats, politicians, researchers and postgraduate students as well.</p>
                </div>
                <div class="col-md-5">
                    <img src="images/book6.jpeg" height="500" width="400">
                </div>
            </div>

            <hr class="featurette-divider">

            <!-- /END THE FEATURETTES -->


            <!-- FOOTER -->
            <footer>
                <img src="images/logo.jpg" height="150" width="210">
                <br><br><br>
                <p class="float-right"><a href="#">Back to top</a></p>
                <p>&copy; 2017 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
                
            </footer>

        </div><!-- /.container -->


        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
        <script>window.jQuery || document.write('<script src="bootstraps/docs/assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
        <script src="bootstraps/docs/dist/js/bootstrap.min.js"></script>
        <!--         Just to make our placeholder images work. Don't actually copy the next line! -->
        <script src="bootstraps/docs/assets/js/vendor/holder.min.js"></script>
        <!--         IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="bootstraps/docs/assets/js/ie10-viewport-bug-workaround.js"></script>
    </body>
</html>
