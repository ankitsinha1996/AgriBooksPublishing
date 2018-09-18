package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"bootstraps/docs/examples/carousel/carousel.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"bootstraps/docs/examples/album/album.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("                        <a class=\"nav-link\" href=\"login.jsp\">Login</a>\n");
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
      out.write("        <section class=\"jumbotron text-center\" >\n");
      out.write("            <div class=\"carousel-item active\">\n");
      out.write("                <img class=\"first-slide\" src=\"images\\firstslide.jpg\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h1>Gallery</h1>\n");
      out.write("                        <p>You find a lot of junk when you're searching through lost and tossed photo ephemera, but every so often you'll find a gem, a wallet-sized masterpiece you're certain could hang on the wall of a gallery if only someone with a name had taken it. Find one or two of those and you're hooked for life.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <div class=\"album text-muted\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"images/1.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                        <p class=\"card-text\"><h4><font face=\"Alexa\">Agriculture is the most healthful,most useful and most noble employment of man.</font></h4></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"images/2.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                        <p class=\"card-text\"><h4><font face=\"Alexa\">Farming is a profession of hope</font></h4></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"images/3.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                        <p class=\"card-text\"><h4><font face=\"Alexa\">You cannot have a happy,healthy and peaceful continent without food</font></h4></p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"images/4.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                        <p class=\"card-text\"><h4><font face=\"Alexa\">A dream doesn't become through magic; it takes sweat,determination and hardwork.</font></h4></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"images/5.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                        <p class=\"card-text\"><h4><font face=\"Alexa\">Always do your best; what you plant now you will harvest letter.</font></h4></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"images/6.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                        <p class=\"card-text\"><h4><font face=\"Alexa\">Agriculture is the happiest employment we can follow.</font></h4></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"images/7.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                        <p class=\"card-text\"><h4><font face=\"Alexa\">If you have faith as small as a master seed; nothing will be impossible for you.</font></h4></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"images/8.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                        <p class=\"card-text\"><h4><font face=\"Alexa\">Cultivators of the earth are the most valuable citizens.</font></h4></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"images/9.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                        <p class=\"card-text\"><h4><font face=\"Alexa\">Soil is a national asset as the soil goes,so goes the nation.</font></h4></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"images/10.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                            <p class=\"card-text\"><h4><font face=\"Alexa\">The discovery of agriculture was the first big step towards a civilized mankind.</font></h4></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"images/11.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                            <p class=\"card-text\"><h4><font face=\"Alexa\">We cannot be sure of having something to live for unless we are willing to die for it.</font></h4></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"images/12.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                            <p class=\"card-text\"><h4><font face=\"Alexa\">Don't judge each day by the harvest you reap, but by the seeds that you plant.</font></h4></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"images/13.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                            <p class=\"card-text\"><h4><font face=\"Alexa\">Life is better on the firm.</font></h4></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"images/14.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                            <p class=\"card-text\"><h4><font face=\"Alexa\">Every seed grows into something amazing.</font></h4></p>\n");
      out.write("                        </div>    \n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <img src=\"images/15.jpg\" height=\"300\" width=\"250\">\n");
      out.write("                            <p class=\"card-text\"><h4><font face=\"Alexa\">\n");
      out.write("                                Faith\n");
      out.write("                                Hope\n");
      out.write("                                Love\n");
      out.write("                                Farming\n");
      out.write("                                </font>\n");
      out.write("                            </h4>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.1.1.slim.min.js\" integrity=\"sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"bootstraps/docs/assets/js/vendor/jquery.min.js\"><\\/script>')</script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js\" integrity=\"sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"bootstraps/docs/assets/js/vendor/holder.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                Holder.addTheme(\"thumb\", {background: \"#55595c\", foreground: \"#eceeef\", text: \"Thumbnail\"});\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script src=\"bootstraps/docs/dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("        <script src=\"bootstraps/docs/assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
