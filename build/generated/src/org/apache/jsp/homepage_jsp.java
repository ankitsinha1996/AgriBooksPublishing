package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"icon\" href=\"images/agri.jpg\">\n");
      out.write("\n");
      out.write("        <title>AGRI-Books Publishing House</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"bootstraps/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/home.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font.css\">\n");
      out.write("        \n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"bootstraps/docs/examples/carousel/carousel.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('images/homebackground.jpg')\">\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-toggleable-md navbar-inverse fixed-top bg-inverse\">\n");
      out.write("            <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("\n");
      out.write("                <img src=\"images/icon.jpg\" height=\"35\" width=\"50\">\n");
      out.write("\n");
      out.write("            </a>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">AGRI-Books</a>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"homepage.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"gallery.jsp\">Gallery</a>\n");
      out.write("                    </li>\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"log.jsp\">Login</a>\n");
      out.write("                    </li>\n");
      out.write("                    <!--          <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link disabled\" href=\"#\">Disabled</a>\n");
      out.write("                              </li>-->\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline mt-2 mt-md-0\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\">\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img class=\"first-slide\" src=\"images\\firstslide.jpg\" alt=\"First slide\" height=\"550\" width=\"1366\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block text-left\">\n");
      out.write("                            <h1>Explore The KnowledgeHub.</h1>\n");
      out.write("                            <h3>One book, one pen, one child, and one teacher can change the world.</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"second-slide\" src=\"images\\secondslide.jpg\" alt=\"Second slide\" height=\"550\" width=\"1366\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                            <h1>Knowledge of Agriculture</h1>\n");
      out.write("                            <h3>The discovery of agriculture was the first big step toward a civilized life.</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"third-slide\" src=\"images\\thirdslide.jpg\" alt=\"Third slide\" height=\"550\" width=\"1366\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block text-right\">\n");
      out.write("                            <h1>Write Thoughts with Pen,Be an Author.</h1>\n");
      out.write("                            <p>To write what is worth publishing, to find honest people to publish it, and get sensible people to read it, are the three great difficulties in being an author</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Marketing messaging and featurettes\n");
      out.write("        ================================================== -->\n");
      out.write("        <!-- Wrap the rest of the page in another container to center all the content. -->\n");
      out.write("\n");
      out.write("        <div class=\"container marketing\">\n");
      out.write("\n");
      out.write("            <!-- Three columns of text below the carousel -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <img class=\"rounded-circle\" src=\"images/bijoy.jpg\" alt=\"Generic placeholder image\" width=\"140\" height=\"140\">\n");
      out.write("                    <h2>Bijoy Debnath</h2>\n");
      out.write("                    <p>Developer & Designer</p>\n");
      out.write("                    <p><a class=\"btn btn-secondary\" href=\"https://www.facebook.com/bijoy.debnath.7758\" role=\"button\">View details &raquo;</a></p>\n");
      out.write("                </div><!-- /.col-lg-4 -->\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <img class=\"rounded-circle\" src=\"images/ankita.jpg\" alt=\"Generic placeholder image\" width=\"140\" height=\"140\">\n");
      out.write("                    <h2>Ankita Parui</h2>\n");
      out.write("                    <p>Coder</p>\n");
      out.write("                    <p><a class=\"btn btn-secondary\" href=\"https://www.facebook.com/ankita.parui.3\" role=\"button\">View details &raquo;</a></p>\n");
      out.write("                </div><!-- /.col-lg-4 -->\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <img class=\"rounded-circle\" src=\"images/ankit.jpg\" alt=\"Generic placeholder image\" width=\"140\" height=\"140\">\n");
      out.write("                    <h2>Ankit Sinha</h2>\n");
      out.write("                    <p>Coder</p>\n");
      out.write("                    <p><a class=\"btn btn-secondary\" href=\"https://www.facebook.com/ankit.sinha.3192\" role=\"button\">View details &raquo;</a></p>\n");
      out.write("                </div><!-- /.col-lg-4 -->\n");
      out.write("            </div><!-- /.row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- START THE FEATURETTES -->\n");
      out.write("\n");
      out.write("            <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("            <div class=\"row featurette\">\n");
      out.write("                <div class=\"col-md-7\">\n");
      out.write("                    <h2 class=\"featurette-heading\">Food History Almanac 2 Volume Set.</h2><span class=\"text-muted\"><h3>Over 1,300 Years of World Culinary History, Culture, and Social Influence</h3></span>\n");
      out.write("                    <p class=\"lead\">The Food History Almanac covers 365 days of the year, with information and anecdotes relating to food history from around the world from medieval times to the present. The daily entries include such topics as celebrations; significant food-related moments in history from the fields of science and technology, exploration and discovery, travel, literature, hotel and restaurant history, and military history; menus from famous and infamous meals across a wide spectrum, from extravagant royal banquets to war rations and prison fare; birthdays of important people in the food field; and publication dates for important cookbooks and food texts and first known recipes. Food historian Janet Clarkson has drawn from her vast compendium of historical cookbooks, food texts, scholarly articles, journals, diaries, ships logs, letters, official reports, and newspaper and magazine articles to bring food history alive. History buffs, foodies, students doing reports, and curious readers will find it a constant delight. An introduction, list of recipes, selected bibliography, and set index, plus a number of period illustrations are added value.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-5\">\n");
      out.write("                    <img src=\"images/book8.jpeg\" height=\"500\" width=\"400\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("            <div class=\"row featurette\">\n");
      out.write("                <div class=\"col-md-7 push-md-5\">\n");
      out.write("                    <h2 class=\"featurette-heading\">Feeding the World in the 21st Century.</h2><span class=\"text-muted\"><h3>A Historical Analysis of Agriculture and Society</h3></span></h2>\n");
      out.write("                    <p class=\"lead\">Agriculture has successfully managed to increase production faster than demand for nearly one and a half centuries, and agricultural policy has developed through times of impasse during this period. This book provides and utilizes a historical understanding of the current global food situation as the basis for analyzing the ultimate challenge on how to feed an ever-expanding world of 10 billion people.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-5 pull-md-7\">\n");
      out.write("                    <img src=\"images/book9.jpeg\" height=\"500\" width=\"400\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("            <div class=\"row featurette\">\n");
      out.write("                <div class=\"col-md-7\">\n");
      out.write("                    <h2 class=\"featurette-heading\">And lastly, this one. <span class=\"text-muted\">Checkmate.</span></h2>\n");
      out.write("                    <p class=\"lead\">Indian agriculture has witnessed a remarkable progress during the past three decades. The Indian agriculture is standing at the cross roads because of the fast changing scenario in global economy of which Indian economy is an integrated part and agriculture continues to be backbone of Indian economy. The book discuss exhaustive studies on various aspects of agricultural sciences. The present book provides the state of agro-ecosystem vis-a-vis environment and outlines future directions so that sustainable agriculture is achieved without causing extensive damage to the fragile agro-ecosystem. The present book entitled Concept of Tropical Agriculture is the compilation of some most recent research articles of eminent scientists from different parts of the country. With its application-oriented and inter-disciplinary approach, the book would be immensely useful to everyone dealing with agriculture sciences, such as University teachers, farmers, academics, technocrats, politicians, researchers and postgraduate students as well.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-5\">\n");
      out.write("                    <img src=\"images/book6.jpeg\" height=\"500\" width=\"400\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("            <!-- /END THE FEATURETTES -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- FOOTER -->\n");
      out.write("            <footer>\n");
      out.write("                <p class=\"float-right\"><a href=\"#\">Back to top</a></p>\n");
      out.write("                <p>&copy; 2017 Company, Inc. &middot; <a href=\"#\">Privacy</a> &middot; <a href=\"#\">Terms</a></p>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("        </div><!-- /.container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript\n");
      out.write("        ================================================== -->\n");
      out.write("        <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.1.1.slim.min.js\" integrity=\"sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"bootstraps/docs/assets/js/vendor/jquery-slim.min.js\"><\\/script>')</script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js\" integrity=\"sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"bootstraps/docs/dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--         Just to make our placeholder images work. Don't actually copy the next line! -->\n");
      out.write("        <script src=\"bootstraps/docs/assets/js/vendor/holder.min.js\"></script>\n");
      out.write("        <!--         IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("        <script src=\"bootstraps/docs/assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
