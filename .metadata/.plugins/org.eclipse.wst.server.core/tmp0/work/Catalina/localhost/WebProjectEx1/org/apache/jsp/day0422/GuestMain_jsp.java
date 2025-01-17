/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-04-25 06:32:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.day0422;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GuestMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.0.js\"></script>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Jua&family=Lobster&family=Nanum+Brush+Script&display=swap\" rel=\"stylesheet\">  \n");
      out.write("<style type=\"text/css\">\n");
      out.write("	div.header{\n");
      out.write("		width: 80%;\n");
      out.write("		height: 110px;\n");
      out.write("		line-height: 110px;\n");
      out.write("		text-align: center;\n");
      out.write("		font-size: 35px;\n");
      out.write("		font-family: 'Lobster';\n");
      out.write("		font-weight: bold;\n");
      out.write("		border: 10px solid gold;	\n");
      out.write("		margin-bottom: 30px;	\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	div.all{\n");
      out.write("		width: 1100px;	\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	div.inform{\n");
      out.write("		font-size: '20px';\n");
      out.write("		font-family: 'Jua';\n");
      out.write("		float: left;\n");
      out.write("		width: 480px;\n");
      out.write("		height: auto;\n");
      out.write("		border: 5px solid gray;\n");
      out.write("		padding: 20px 20px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	div.list{\n");
      out.write("		font-size: '20px';\n");
      out.write("		font-family: 'Jua';\n");
      out.write("		float: right;\n");
      out.write("		width: 600px;\n");
      out.write("		height: auto;\n");
      out.write("		border: 5px solid gray;\n");
      out.write("		padding: 20px 20px;\n");
      out.write("	}	\n");
      out.write("	\n");
      out.write("	img.imgphoto{\n");
      out.write("		width: 55px;\n");
      out.write("		height: 55px;\n");
      out.write("		margin-right: 3px;	\n");
      out.write("		cursor: pointer;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.select{\n");
      out.write("		border: 2px solid black;\n");
      out.write("		box-shadow: 3px 3px 3px gray;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	span.mod,span.del{\n");
      out.write("		margin-left: 10px;\n");
      out.write("		cursor: pointer;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	span.day{\n");
      out.write("		float: right;\n");
      out.write("		color: #999;\n");
      out.write("		font-size: 13px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	img.avata{\n");
      out.write("		width: 80px;\n");
      out.write("	}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	$(function() {\n");
      out.write("		list();	//처음 시작시 목록 출력\n");
      out.write("		//저장 이벤트\n");
      out.write("		$(\".btnsave\").click(function(){\n");
      out.write("			//폼 전체 데이터를 읽어서 insert.jsp로 보낸다\n");
      out.write("			//성공후 list() 다시 호출후, 입력값 초기화\n");
      out.write("			var fdata = $(\"#frm\").serialize();\n");
      out.write("			$.ajax({\n");
      out.write("				type: \"post\",\n");
      out.write("				dataType: \"html\",\n");
      out.write("				data: fdata,\n");
      out.write("				url: \"insert.jsp\",\n");
      out.write("				success:function(){\n");
      out.write("					list();\n");
      out.write("					$(\"#writer\").val(\"\");\n");
      out.write("					$(\"#pass\").val(\"\");\n");
      out.write("					$(\"#content\").val(\"\");\n");
      out.write("					\n");
      out.write("					$(\"#avata\").val(\"1\");\n");
      out.write("					$(\"#img.imgphoto\").removeClass(\"select\");\n");
      out.write("					$(\"#img.imgphoto:first\").addClass(\"select\");\n");
      out.write("				}\n");
      out.write("			});\n");
      out.write("		});\n");
      out.write("		\n");
      out.write("		//삭제 이벤트\n");
      out.write("		$(document).on(\"click\",\"span.del\",function(){\n");
      out.write("			var num = $(this).attr(\"num\");\n");
      out.write("			//비번 입력\n");
      out.write("			var pass = prompt(\"이 글에 대한 비밀번호를 입력해주세요\");\n");
      out.write("			console.log(num + \",\" + pass);\n");
      out.write("			//취소 클릭하거나 비번을 입력하지 않았을 경우 함수 종료\n");
      out.write("			if(pass == null || pass.length == 0) {\n");
      out.write("				return;\n");
      out.write("			}\n");
      out.write("			\n");
      out.write("			$.ajax({\n");
      out.write("				type: \"get\",\n");
      out.write("				dataType: \"json\",\n");
      out.write("				url: \"delete.jsp\",\n");
      out.write("				data: {\"num\":num,\"pass\":pass},\n");
      out.write("				success:function(data){\n");
      out.write("					if(data.result == 'true'){\n");
      out.write("						alert(\"삭제되었습니다\");\n");
      out.write("						location.reload(); //새로고침\n");
      out.write("					}else {\n");
      out.write("						alert(\"비번이 맞지 않습니다\");\n");
      out.write("					}\n");
      out.write("				}\n");
      out.write("			});\n");
      out.write("			\n");
      out.write("		});\n");
      out.write("		\n");
      out.write("		//수정 이벤트\n");
      out.write("		$(document).on(\"click\",\"span.mod\",function(){\n");
      out.write("			var num = $(this).attr(\"num\");\n");
      out.write("			//비번 입력\n");
      out.write("			var pass = prompt(\"이 글에 대한 비밀번호를 입력해주세요\");\n");
      out.write("			console.log(num + \",\" + pass);\n");
      out.write("			//취소 클릭하거나 비번을 입력하지 않았을 경우 함수 종료\n");
      out.write("			if(pass == null || pass.length == 0) {\n");
      out.write("				return;\n");
      out.write("			}\n");
      out.write("			\n");
      out.write("			$.ajax({\n");
      out.write("				type: \"get\",\n");
      out.write("				dataType: \"json\",\n");
      out.write("				url: \"equalpass.jsp\",\n");
      out.write("				data: {\"num\":num,\"pass\":pass},\n");
      out.write("				success:function(data){\n");
      out.write("					if(data.result == 'true'){\n");
      out.write("						//비번이 맞으면 수정폼으로 이동\n");
      out.write("						location.href = 'updateForm.jsp?num=' + num; \n");
      out.write("					}else {\n");
      out.write("						alert(\"비번이 맞지 않습니다\");\n");
      out.write("					}\n");
      out.write("				}\n");
      out.write("			});\n");
      out.write("			\n");
      out.write("		});\n");
      out.write("		\n");
      out.write("		\n");
      out.write("	}); //$function close\n");
      out.write("	\n");
      out.write("	function list()\n");
      out.write("	{\n");
      out.write("		$.ajax({\n");
      out.write("			type: \"get\",\n");
      out.write("			dataType: \"json\",\n");
      out.write("			url: \"list.jsp\",\n");
      out.write("			success: function(data){\n");
      out.write("				var s =\" \";\n");
      out.write("				$.each(data, function(i, elt) {\n");
      out.write("					s += \"<table class='table'>\";            \n");
      out.write("					s += \"<tr><td>\";\n");
      out.write("					s += \"<b>\" + elt.writer + \"</b>\";\n");
      out.write("					s += \"<span class='mod' num=\" +elt.num + \">수정</span>\";\n");
      out.write("					s += \"<span class='del' num=\" +elt.num + \">삭제</span>\";\n");
      out.write("					s += \"<span class='day'>\" +elt.writeday + \"</span>\";\n");
      out.write("					s += \"</td></tr>\";\n");
      out.write("					\n");
      out.write("					s += \"<tr><td>\";\n");
      out.write("					s += \"<img src='../avata/s\" + elt.avata +\".JPG' class='avata' align='left' hspace=20>\";\n");
      out.write("					s += \"<pre>\" + elt.content + \"</pre>\";\n");
      out.write("					\n");
      out.write("					s += \"</td></tr>\";\n");
      out.write("					s += \"</table><br><br>\";\n");
      out.write("				});\n");
      out.write("				\n");
      out.write("				$(\"div.list\").html(s);\n");
      out.write("			}\n");
      out.write("		});\n");
      out.write("	}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"header\">\n");
      out.write("	Guest Ajax Test\n");
      out.write("</div>\n");
      out.write("<div class=\"all\">\n");
      out.write("	<div class=\"inform\">\n");
      out.write("		<form id=\"frm\" class=\"form-inline\">\n");
      out.write("			<table class=\"table\">\n");
      out.write("				<tr>\n");
      out.write("					<td width=\"350\">\n");
      out.write("						작성자 : <input type=\"text\" id=\"writer\" name=\"writer\" class=\"form-control\"\n");
      out.write("								style=\"width: 100px;\"> \n");
      out.write("						비번 : <input type=\"password\" id=\"pass\" n.ame=\"pass\" class=\"form-control\"\n");
      out.write("								style=\"width: 100px;\"> \n");
      out.write("					</td>\n");
      out.write("					<td rowspan=\"3\" style=\"cursor: pointer; background-color: orange;\"\n");
      out.write("					align=\"center\" valign=\"middle\" class=\"btnsave\">\n");
      out.write("					저장\n");
      out.write("					</td>\n");
      out.write("				</tr>\n");
      out.write("				\n");
      out.write("				<tr>\n");
      out.write("					<td>\n");
      out.write("						<textarea id=\"content\" name=\"content\" style=\"width: 100%; height: 80px;\"></textarea>\n");
      out.write("					</td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td>\n");
      out.write("						<input type=\"hidden\" name=\"avata\" id=\"avata\" value=\"1\"><br>\n");
      out.write("						");

							for(int i=1; i<=10; i++){
      out.write("\n");
      out.write("								<img src=\"../avata/s");
      out.print(i);
      out.write(".JPG\" class=\"imgphoto\" idx=\"");
      out.print(i);
      out.write("\">\n");
      out.write("							");

								if(i == 5){
      out.write("\n");
      out.write("									<br>\n");
      out.write("								");
}
							}
						
      out.write("\n");
      out.write("						<script type=\"text/javascript\">\n");
      out.write("							//일단 첫번째 이미지에 .select적용\n");
      out.write("							$(\"img.imgphoto\").eq(0).addClass(\"select\");\n");
      out.write("							\n");
      out.write("							//아바타 클릭시 idx값을 얻어서 #avata에 출력\n");
      out.write("							$(\"img.imgphoto\").click(function(){\n");
      out.write("								$(this).siblings().removeClass(\"select\");\n");
      out.write("								\n");
      out.write("							//클릭한 이미지에만 .select가 적용되도록 하기\n");
      out.write("							$(this).addClass(\"select\");\n");
      out.write("							$(\"#avata\").val($(this).attr(\"idx\"));\n");
      out.write("							});					\n");
      out.write("						</script>\n");
      out.write("					</td>\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("		</form>\n");
      out.write("	</div>\n");
      out.write("	<div class=\"list\">\n");
      out.write("		123\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
}
