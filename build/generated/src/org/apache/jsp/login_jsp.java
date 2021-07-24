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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Mixtape</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"description\" content=\"Mixtape template project\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/bootstrap-4.1.2/bootstrap.min.css\">\n");
      out.write("<link href=\"plugins/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.carousel.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.theme.default.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/animate.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/main_styles.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/responsive.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style_1.css\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"super_container\">\n");
      out.write("\t\n");
      out.write("\t<!-- Header -->\n");
      out.write("\t<header class=\"header\">\n");
      out.write("\t\t<div class=\"header_content d-flex flex-row align-items-center justify-content-center\">\n");
      out.write("\t\t\t<div class=\"logo\"><a href=\"#\">Mixtape</a></div>\n");
      out.write("\t\t\t<div class=\"log_reg\">\n");
      out.write("\t\t\t\t<ul class=\"d-flex flex-row align-items-start justify-content-start\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Login</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Register</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<nav class=\"main_nav\">\n");
      out.write("\t\t\t\t<ul class=\"d-flex flex-row align-items-start justify-content-start\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"about.html\">About us</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"music.html\">Music</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"blog.html\">News</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t<div class=\"hamburger ml-auto\">\n");
      out.write("\t\t\t\t<div class=\"d-flex flex-column align-items-end justify-content-between\">\n");
      out.write("\t\t\t\t\t<div></div>\n");
      out.write("\t\t\t\t\t<div></div>\n");
      out.write("\t\t\t\t\t<div></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<!-- Menu -->\n");
      out.write("\n");
      out.write("\t<div class=\"menu\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<div class=\"menu_overlay\"></div>\n");
      out.write("\t\t\t<div class=\"menu_container d-flex flex-column align-items-start justify-content-center\">\n");
      out.write("\t\t\t\t<div class=\"menu_log_reg\">\n");
      out.write("\t\t\t\t\t<ul class=\"d-flex flex-row align-items-start justify-content-start\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Register</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<nav class=\"menu_nav\">\n");
      out.write("\t\t\t\t\t<ul class=\"d-flex flex-column align-items-start justify-content-start\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"about.html\">About us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"music.html\">Music</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"blog.html\">News</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- Home -->\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<div class=\"login\">\n");
      out.write("  <div class=\"form\">\n");
      out.write("    <h2>Welcome</h2>\n");
      out.write("    <input type=\"text\" placeholder=\"Username\">\n");
      out.write("    <input type=\"password\" placeholder=\"Password\">\n");
      out.write("    <input type=\"submit\" value=\"Sign In\" class=\"submit\">\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("\t\n");
      out.write("\t<!-- Footer -->\n");
      out.write("\n");
      out.write("\t<footer class=\"footer\">\n");
      out.write("\t\t<div class=\"footer_container d-flex flex-xl-row flex-column align-items-start justify-content-start\">\n");
      out.write("\t\t\t<div class=\"newsletter_container\">\n");
      out.write("\t\t\t\t<div class=\"newsletter_title\"><h2>Subscribe to our newsletter</h2></div>\n");
      out.write("\t\t\t\t<form action=\"#\" id=\"newsletter_form\" class=\"newsletter_form\">\n");
      out.write("\t\t\t\t\t<input type=\"email\" class=\"newsletter_input\" placeholder=\"Your E-mail\" required=\"required\">\n");
      out.write("\t\t\t\t\t<button class=\"newsletter_button\">Subscribe</button>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"footer_lists d-flex flex-sm-row  flex-column align-items-start justify-content-start ml-xl-auto\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Useful Links -->\n");
      out.write("\t\t\t\t<div class=\"footer_list\">\n");
      out.write("\t\t\t\t\t<div class=\"footer_list_title\">Useful Links</div>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"about.html\">About us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Testimonials</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Music</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"blog.html\">News</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Mixtape -->\n");
      out.write("\t\t\t\t<div class=\"footer_list\">\n");
      out.write("\t\t\t\t\t<div class=\"footer_list_title\">Mixtape</div>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Music</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">PR & Marketing</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">About us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Testimonials</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Connect -->\n");
      out.write("\t\t\t\t<div class=\"footer_list\">\n");
      out.write("\t\t\t\t\t<div class=\"footer_list_title\">Connect</div>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Returns</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Shippings</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Jobs</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Social Media</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Soundcloud</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"copyright_bar\">\n");
      out.write("\t\t\t<span><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("<script src=\"styles/bootstrap-4.1.2/popper.js\"></script>\n");
      out.write("<script src=\"styles/bootstrap-4.1.2/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"plugins/greensock/TweenMax.min.js\"></script>\n");
      out.write("<script src=\"plugins/greensock/TimelineMax.min.js\"></script>\n");
      out.write("<script src=\"plugins/scrollmagic/ScrollMagic.min.js\"></script>\n");
      out.write("<script src=\"plugins/greensock/animation.gsap.min.js\"></script>\n");
      out.write("<script src=\"plugins/greensock/ScrollToPlugin.min.js\"></script>\n");
      out.write("<script src=\"plugins/OwlCarousel2-2.2.1/owl.carousel.js\"></script>\n");
      out.write("<script src=\"plugins/easing/easing.js\"></script>\n");
      out.write("<script src=\"plugins/progressbar/progressbar.min.js\"></script>\n");
      out.write("<script src=\"plugins/parallax-js-master/parallax.min.js\"></script>\n");
      out.write("<script src=\"plugins/jPlayer/jquery.jplayer.min.js\"></script>\n");
      out.write("<script src=\"plugins/jPlayer/jplayer.playlist.min.js\"></script>\n");
      out.write("<script src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
