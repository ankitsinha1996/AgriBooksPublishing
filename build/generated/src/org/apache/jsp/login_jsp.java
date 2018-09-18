package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"icon\" href=\"images/agri.jpg\">\n");
      out.write("\n");
      out.write("        <title>AGRI-Books Login Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <link href=\"css/font.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body class=\"corn\" style=\"background-image: url('images/loginbackground.jpg')\">\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-default navbar-inverse\" role=\"navigation\">\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("\n");
      out.write("                        <img src=\"images/icon.jpg\" height=\"30\" width=\"40\">\n");
      out.write("\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">AGRI-Books</a> \n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"navbar-nav\" href=\"homepage.jsp\"> Home<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <form class=\"navbar-form navbar-left\" role=\"search\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("                    </form>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><p class=\"navbar-text\">Already have an account?</p></li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><b>Login</b> <span class=\"caret\"></span></a>\n");
      out.write("                            <ul id=\"login-dp\" class=\"dropdown-menu\">\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <form class=\"form-signin\" role=\"form\" method=\"post\" action=\"Login\" accept-charset=\"UTF-8\" id=\"login-nav\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label class=\"sr-only\" for=\"exampleInputUsername\">Username</label>\n");
      out.write("                                                    <input type=\"username\" class=\"form-control\" id=\"exampleInputUsername\" placeholder=\"Username\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label class=\"sr-only\" for=\"exampleInputPassword2\">Password</label>\n");
      out.write("                                                    <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword2\" placeholder=\"Password\" required>\n");
      out.write("                                                    \n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <button type=\"Submit\" name=\"Submit\" value=\"Login\" class=\"btn btn-primary btn-block\">Login</button>\n");
      out.write("                                                </div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
