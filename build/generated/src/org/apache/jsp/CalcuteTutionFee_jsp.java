package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CalcuteTutionFee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String sub1 = request.getParameter("subjectlist1");
            String sub2 = request.getParameter("subjectlist2");
            String sub3 = request.getParameter("subjectlist3");
            String sub4 = request.getParameter("subjectlist4");
            String selectedsub = null;
            int total = 0;
          
      out.write("\n");
      out.write("          ");

              
            if ((sub1.matches("Chemistry")) || (sub2.matches("Chemistry")) || (sub3.matches("Chemistry")) || (sub4.matches("Chemistry"))){
                selectedsub += "Chemistry +";
                total +=900;
            }
            else{
                selectedsub = "";
            }
            if ((sub1.matches("Physics")) || (sub2.matches("Physics")) || (sub3.matches("Physics")) || (sub4.matches("Physics"))){
                selectedsub += "Physics +";
                total +=900;
            }
            
            else{
                selectedsub += "";
            }
            
            if ((sub1.matches("Java")) || (sub2.matches("Java")) || (sub3.matches("Java")) || (sub4.matches("Java"))){
                selectedsub += "Java +";
                total +=1000;
            }
            
            else{
                selectedsub += "";
            }
            if ((sub1.matches("Algorithm"))  || (sub2.matches("Algorithm")) || (sub3.matches("Algorithm")) || (sub4.matches("Algorithm"))){
                selectedsub += "Algorithm +";
                total +=1000;
            }
            
            else{
                selectedsub += "";
            }
            if ((sub1.matches("Capstone")) || (sub2.matches("Capstone")) || (sub3.matches("Capstone")) || (sub4.matches("Capstone"))){
                selectedsub += "Capstone";
                total +=1000;
            }
            
            else{
                selectedsub += "";
            }
          
      out.write("\n");
      out.write("         You Selected : ");
      out.print( selectedsub );
      out.write(" Courses  <br/>\n");
      out.write("         Your Tuition Fees would be ");
      out.print( total );
      out.write(" . Thank You\n");
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
