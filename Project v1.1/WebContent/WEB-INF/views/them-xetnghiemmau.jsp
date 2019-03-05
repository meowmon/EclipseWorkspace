<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>

<head>
<%request.setCharacterEncoding("UTF-8"); %>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <link rel="shortcut icon" type="image/png" href="assets/img/LogoTLU.png"/>
    <title>Hệ thống quản lý sức khỏe</title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="assets/css/style-menu.css">
    <link rel="stylesheet" href="assets/css/styles.css">
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>


    <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800" rel="stylesheet" />
  <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
  <!-- Nucleo Icons -->
  <link href="assets/css/nucleo-icons.css" rel="stylesheet" />
  <!-- CSS Files -->
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="assets/css/demo.css" rel="stylesheet" />

</head>

<body>
    <div class="d-block px-3 py-1 text-center text-bold text-white old-bv"></div> 
     <nav class="navbar navbar-expand-lg navbar-absolute navbar-transparent no-bg sticky-top  ">
        <div class="container-fluid">
          <div class="navbar-wrapper">
            <div class="navbar-toggle d-inline">
              <button type="button" class="navbar-toggler">
                <span class="navbar-toggler-bar bar1"></span>
                <span class="navbar-toggler-bar bar2"></span>
                <span class="navbar-toggler-bar bar3"></span>
              </button>
            </div>
             <button type="button" id="sidebarCollapse" class="btn more">
                        <i class="fas fa fa-server"></i>
                    </button>
            <p class="navbar-brand" href="#pablo">Quản lý Hồ sơ xét nghiệm máu</p>
          </div>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
          </button>

          <div class="collapse navbar-collapse" id="navigation">
            <ul class="navbar-nav ml-auto ">

              <li class="dropdown nav-item">
                <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
                  <div class="photo">
                    <img src="assets/img/anime3.png">
                  </div>
                 
                  <p class="d-lg-none">
                    Log out
                  </p>
                </a>
                <ul class="dropdown-menu dropdown-navbar">
                  <li class="nav-link">
                    <a href="#" class="nav-item dropdown-item">Profile</a>
                  </li>
                  <li class="nav-link">
                    <a href="#" class="nav-item dropdown-item">Settings</a>
                  </li>
                  <div class="dropdown-divider"></div>
                  <li class="nav-link">
                    <a href="#" class="nav-item dropdown-item">Log out</a>
                  </li>
                </ul>
              </li>
              <li class="separator d-lg-none"></li>
            </ul>
          </div>
        </div>
      </nav>

    <div class="wrapper">
       
        <!-- Sidebar  -->
        <nav id="sidebar">
        
        <div id="sidebar-cover">
            <div class="sidebar-header">
                    <a href=""><h3>Health care</h3></a> 
            </div>

            <ul class="list-unstyled components">
                <p class="head-title">Thăng Long University</p>
                <li>
                    <a href="${pageContext.request.contextPath}/departmentList">Quản lý Khoa</a>
                </li>
                 <li class="">
                    <a href="${pageContext.request.contextPath}/subjectList">Quản lý Bộ Môn</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/userList">Quản lý Giáo viên</a>
                </li>
                <li class="active">
                    <a href="${pageContext.request.contextPath}/examList">Quản lý Kỳ khám</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/examfileList">Quản lý Hồ sơ khám bệnh</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/diseaseTypeList">Quản lý Loại bệnh</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/diseaseList">Quản lý Bệnh</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/problemList">Quản lý Sự cố sức khỏe</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/requestList">Quản lý giáo viên cần khám</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/report">Thống kê báo cáo</a>
                </li>
            </ul>

            <ul class="list-unstyled CTAs">
              <div>
                  <image src="assets/img/LogoTLU.png" class="container-fluid mb-3 mt--2"> </image>
               </div>
                <li>
                    <a href="#" class="download">Trợ giúp</a>
                </li>
                <li>
                    <a href="#" class="article">Đội ngũ thiết kế</a>
                </li>
            </ul>
        </div>
        </nav>

        <!-- Page Content  -->
        <div id="content">
        <div class="card card-body">
           <form method="post" action="createBloodAnalyze">
            <div class="border-gray">
                <div class="border-gray">
                    <h5>Thông tin xét nghiệm máu</h5>
                    <div class="line_20"></div>
                   <input type="hidden" class="form-control" name = "id" id="hiddenvar"  value="${id}" >
                      <div class="form-row">
                        <div class="col-md-2 mb-5">
                          <label for="validationDefault01">Nhóm máu</label>
                          <input type="text" class="form-control" name = "nhommau" id="validationDefault01" placeholder="Nhóm máu" value="" required>
                      </div> 
                      </div>  

                      <div class="form-row">
                        <h6>Chỉ số chi tiết</h6>
                        <div class="iviline_20"></div>
                        <div class="col-md-2 mb-2">
                          <label for="validationDefault01">WBC</label>
                          <input type="text" class="form-control" id="validationDefault01" placeholder="WBC" name= "wbc" value="" required>
                        </div>
                        <div class="col-md-2 mb-2">
                          <label for="validationDefault01">RBC</label>
                          <input type="text" class="form-control" id="validationDefault01" placeholder="WBC" name= "rbc" value="" required>
                        </div>
                        <div class="col-md-2 mb-2">
                          <label for="validationDefault01">HB</label>
                          <input type="text" class="form-control" id="validationDefault01" placeholder="HB" name="hb" value="" required>
                        </div>
                      </div>
                      <div class="form-row">
                        <div class="col-md-2 mb-5">
                          <label for="validationDefault01">HCT</label>
                          <input type="text" class="form-control" id="validationDefault01" placeholder="HCT" name="hct" value="" required>
                        </div>
                        <div class="col-md-2 mb-5">
                          <label for="validationDefault01">MCV</label>
                          <input type="text" class="form-control" id="validationDefault01" placeholder="MCV" name= "mcv" value="" required>
                        </div>
                        <div class="col-md-2 mb-5">
                          <label for="validationDefault01">MCH</label>
                          <input type="text" class="form-control" id="validationDefault01" placeholder="MCH" name= "mch" value="" required>
                        </div>
                      </div>
                    </div>


                  <div class="form-row">
                    <div class="col-md-6 mb-3">
                      <label for="validationDefault01">Mô tả</label>
                      <textarea class="form-control" name="descrip" aria-label="Mô tả"></textarea>
                    </div>
                  </div>

                  <div class="form-row">
                    <div class="col-md-6 mb-3">
                      <label for="validationDefault01">Điều trị</label>
                      <textarea class="form-control" name="dieutri" aria-label="Mô tả"></textarea>
                    </div>
                  </div>

                  <div class="form-row">
                <div class="col-md-8 mb-3">
                  <label for="validationDefault01">Kết luận bệnh mắc phải</label>
                  <select class="form-control" name="idbenh" id="select_projects">
                   <option value="">Không xác định</option>
                   <c:forEach items="${diseaseList}" var="list">
                   	<option value="${list.diseaseId}">${list.name}</option>
                   </c:forEach>
                  </select>
              </div>
              </div>
              </div>

              <a href="hosokham-chitiet.html"><button class="btn btn-default" type="button">Hủy bỏ</button></a>
              <button class="btn btn-warning" type="submit">Lưu</button>
          </form>
          
        </div>
             <!-- End Main  --> 

    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    <!-- jQuery Custom Scroller CDN -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#sidebar").mCustomScrollbar({
                theme: "minimal"
            });

            $('#sidebarCollapse').on('click', function () {
                $('#sidebar, #content').toggleClass('active');
                $('.collapse.in').toggleClass('in');
                $('a[aria-expanded=true]').attr('aria-expanded', 'false');
            });
        });
    </script>
</body>

</html>