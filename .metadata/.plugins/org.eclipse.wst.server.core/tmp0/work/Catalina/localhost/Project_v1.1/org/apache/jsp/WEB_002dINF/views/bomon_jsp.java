/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-03-01 02:28:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bomon_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/Github/EclipseWorkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Project%20v1.1/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1531452420000L));
    _jspx_dependants.put("/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.5.jar", Long.valueOf(1548354033708L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("    <title>Quản lý bộ môn</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS CDN -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\r\n");
      out.write("    <!-- Our Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style-menu.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("    <!-- Scrollbar Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Font Awesome JS -->\r\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\" integrity=\"sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js\" integrity=\"sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800\" rel=\"stylesheet\" />\r\n");
      out.write("  <link href=\"https://use.fontawesome.com/releases/v5.0.6/css/all.css\" rel=\"stylesheet\">\r\n");
      out.write("  <!-- Nucleo Icons -->\r\n");
      out.write("  <link href=\"assets/css/nucleo-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("  <!-- CSS Files -->\r\n");
      out.write("  <!-- CSS Just for demo purpose, don't include it in your project -->\r\n");
      out.write("  <link href=\"assets/css/demo.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"d-block px-3 py-1 text-center text-bold text-white old-bv\"></div> \r\n");
      out.write("     <nav class=\"navbar navbar-expand-lg navbar-absolute navbar-transparent no-bg sticky-top  \">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <div class=\"navbar-wrapper\">\r\n");
      out.write("            <div class=\"navbar-toggle d-inline\">\r\n");
      out.write("              <button type=\"button\" class=\"navbar-toggler\">\r\n");
      out.write("                <span class=\"navbar-toggler-bar bar1\"></span>\r\n");
      out.write("                <span class=\"navbar-toggler-bar bar2\"></span>\r\n");
      out.write("                <span class=\"navbar-toggler-bar bar3\"></span>\r\n");
      out.write("              </button>\r\n");
      out.write("            </div>\r\n");
      out.write("             <button type=\"button\" id=\"sidebarCollapse\" class=\"btn more\">\r\n");
      out.write("                        <i class=\"fas fa fa-server\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("            <p class=\"navbar-brand\" href=\"#pablo\">Quản lý Bộ môn</p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\r\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\r\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"navigation\">\r\n");
      out.write("            <ul class=\"navbar-nav ml-auto \">\r\n");
      out.write("            <!-- BAT DAU COPY NOTIFY TU DAY -->\r\n");
      out.write("              <li class=\"dropdown nav-item\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown nav-link\" data-toggle=\"dropdown\">\r\n");
      out.write("                  <div id=\"ex4\" class=\"inline\">\r\n");
      out.write("                  <strong style=\"color:white\">");
      out.print(session.getAttribute("notic")  );
      out.write("</strong>\r\n");
      out.write("                  <span class=\"p1 fa-stack has-badge\" data-count=\"");
      out.print(session.getAttribute("notic")  );
      out.write("\">\r\n");
      out.write("                    <div class=\"photo\" id=\"ex4\" data-count=\"4\">\r\n");
      out.write("                    <img src=\"assets/img/bell.png\" data-count=\"4b\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                    \r\n");
      out.write("                  </span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"dropdown-menu dropdown-menu-right overflow-auto\" style=\"min-width: 380px; max-height:400px; padding-top: 0 !important; padding-bottom: 0 !important; in;overflow-y: scroll; \">\r\n");
      out.write("                  <div class=\"tile\">\r\n");
      out.write("                      <div class=\"tile-inner title text-black mb-3\">\r\n");
      out.write("                          <strong>Thông báo</strong>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                      \r\n");
      out.write("                      <a class=\"tile\">\r\n");
      out.write("                          <div class=\"tile-inner text-black text-center mb-1\">\r\n");
      out.write("                              <a href=\"#\"><span>Show All</span></a>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- KET THUC PHAN NOTIFY -->\r\n");
      out.write("\r\n");
      out.write("              <li class=\"dropdown nav-item\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\">\r\n");
      out.write("                  <div class=\"photo\">\r\n");
      out.write("                    <img src=\"assets/img/anime3.png\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                 \r\n");
      out.write("                  <p class=\"d-lg-none\">\r\n");
      out.write("                    Log out\r\n");
      out.write("                  </p>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu dropdown-navbar\">\r\n");
      out.write("                  <li class=\"nav-link\">\r\n");
      out.write("                    <a href=\"#\" class=\"nav-item dropdown-item\">Profile</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-link\">\r\n");
      out.write("                    <a href=\"#\" class=\"nav-item dropdown-item\">Settings</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                  <li class=\"nav-link\">\r\n");
      out.write("                    <a href=\"#\" class=\"nav-item dropdown-item\">Log out</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"separator d-lg-none\"></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("       \r\n");
      out.write("        <!-- Sidebar  -->\r\n");
      out.write("        <nav id=\"sidebar\">\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"sidebar-cover\">\r\n");
      out.write("            <div class=\"sidebar-header\">\r\n");
      out.write("                    <a href=\"\"><h3>Health care</h3></a> \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"list-unstyled components\">\r\n");
      out.write("                <p class=\"head-title\">Thăng Long University</p>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/departmentList\">Quản lý Khoa</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                 <li class=\"active\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/subjectList\">Quản lý Bộ Môn</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/userList\">Quản lý Giáo viên</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/examList\">Quản lý Kỳ khám</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/examfileList\">Quản lý Hồ sơ khám bệnh</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/diseaseTypeList\">Quản lý Loại bệnh</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/diseaseList\">Quản lý Bệnh</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/problemList\">Quản lý Sự cố sức khỏe</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/requestList\">Quản lý giáo viên cần khám</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/report\">Thống kê báo cáo</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("                <!-- Main  --> \r\n");
      out.write("               <div id=\"content\">\r\n");
      out.write("                <!-- Main  --> \r\n");
      out.write("        <div class=\"\">\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light topnav\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    \r\n");
      out.write("                    <li class=\"nav-item list-item\">\r\n");
      out.write("                        <a href=\"createSubject\">\r\n");
      out.write("                          <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-success\">\r\n");
      out.write("                                  <i class=\"fas fa fa-plus\"></i>\r\n");
      out.write("                                  <span>Thêm Bộ môn</span>\r\n");
      out.write("                          </button>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item list-item\">\r\n");
      out.write("                        <div class=\"dropdown show\">\r\n");
      out.write("                            <a class=\"btn btn-secondary dropdown-toggle\" href=\"#\" role=\"button\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                           Khoa\r\n");
      out.write("                          </a>\r\n");
      out.write("\r\n");
      out.write("                          <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink\">\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Khoa 1</a>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Khoa 2</a>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Something else here</a>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                  \r\n");
      out.write("                    <li class=\"nav-item list-item\">\r\n");
      out.write("                        <div class=\"search-container\">\r\n");
      out.write("                            <form action=\"#\">\r\n");
      out.write("                              <input class=\"border\" type=\"text\" placeholder=\"Search..\" name=\"search\">\r\n");
      out.write("                              <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item list-item\">\r\n");
      out.write("                            <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-info\">\r\n");
      out.write("                                <i class=\"fas fa-align-left\"></i>\r\n");
      out.write("                                <span>Danh sách tất cả Bộ môn</span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <div class=\"card \">\r\n");
      out.write("              <div class=\"card-header\">\r\n");
      out.write("                <h4> Danh sách Bộ môn</h4>\r\n");
      out.write("                <p style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorString}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("              </div>\r\n");
      out.write("               <div class=\"card-body\">\r\n");
      out.write("                <div class=\"table-responsive\">\r\n");
      out.write("                  <table class=\"table tablesorter \" id=\"\">\r\n");
      out.write("                    <thead class=\" text-head\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <th scope=\"col\">STT</th>\r\n");
      out.write("                      <th scope=\"col\">Tên Bộ môn</th>\r\n");
      out.write("                      <th scope=\"col\">Mã bộ môn\r\n");
      out.write("                      <th scope=\"col\">Khoa</th>\r\n");
      out.write("                      <th scope=\"col\">Sửa</th>\r\n");
      out.write("                      <th scope=\"col\">Xóa</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  </thead>\r\n");
      out.write("                  <tbody>\r\n");
      out.write("                   \r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("                  </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"line_20\"> </div>\r\n");
      out.write("            <div class=\"pagination\">\r\n");
      out.write("              <a href=\"#\">&laquo;</a>\r\n");
      out.write("              <a href=\"#\" class=\"active\">1</a>\r\n");
      out.write("              <a href=\"#\">2</a>\r\n");
      out.write("              <a href=\"#\">3</a>\r\n");
      out.write("              <a href=\"#\">4</a>\r\n");
      out.write("              <a href=\"#\">5</a>\r\n");
      out.write("              <a href=\"#\">6</a>\r\n");
      out.write("              <a href=\"#\">&raquo;</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("             <!-- End Main  --> \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery CDN - Slim version (=without AJAX) -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <!-- Popper.JS -->\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <!-- Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <!-- jQuery Custom Scroller CDN -->\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            $(\"#sidebar\").mCustomScrollbar({\r\n");
      out.write("                theme: \"minimal\"\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#sidebarCollapse').on('click', function () {\r\n");
      out.write("                $('#sidebar, #content').toggleClass('active');\r\n");
      out.write("                $('.collapse.in').toggleClass('in');\r\n");
      out.write("                $('a[aria-expanded=true]').attr('aria-expanded', 'false');\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/bomon.jsp(82,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/bomon.jsp(82,4) '${noti}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${noti}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/bomon.jsp(82,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("notify");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t<a href=\"requestList?rnoti=read\">\r\n");
            out.write("                      <div class=\"tile mb-3\">\r\n");
            out.write("                        <div class=\"inline\">\r\n");
            out.write("                          <div class=\"noti\">\r\n");
            out.write("                              <div class=\"tile-inner font09 truncate ellipsis chrome \">\r\n");
            out.write("                                  <span>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notify.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(" </span>\r\n");
            out.write("                              </div>\r\n");
            out.write("                              <div class=\"tile-inner2 text-black font07\">\r\n");
            out.write("                                <span>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notify.date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span>\r\n");
            out.write("                              </div>\r\n");
            out.write("                          </div>\r\n");
            out.write("                        </div>\r\n");
            out.write("                      </div>\r\n");
            out.write("                      </a>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /WEB-INF/views/bomon.jsp(252,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/bomon.jsp(252,20) '${subjectList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${subjectList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/bomon.jsp(252,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("subject");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <tr>\r\n");
            out.write("\t\t\t             <th>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subject.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</th>\r\n");
            out.write("\t\t\t             <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subject.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t             <td>S");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subject.subId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t             <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subject.khoa}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t             <td><a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("/editSubject?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subject.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"><i class=\"fas fa fa-edit\"></i></a></td><!-- button Sửa -->\r\n");
            out.write("\t\t\t             <td><a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("/deleteSubject?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subject.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"><i class=\"fas fa fa-times\"></i></a></td><!-- button Xóa -->\r\n");
            out.write("                    </tr>\r\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }
}
