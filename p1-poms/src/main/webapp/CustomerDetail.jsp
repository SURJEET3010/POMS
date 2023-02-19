<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ page import="java.sql.*" %>
<%@ page import="java.io.IOException" %>


<!DOCTYPE html>
  <html lang="en">
    
    <head>
      <meta charset="utf-8">
      <meta content="width=device-width, initial-scale=1.0" name="viewport">
      <meta charset="ISO-8859-1">
    
      <title>Welcome</title>
      <meta content="" name="description">
      <meta content="" name="keywords">
    
      <!-- Favicons -->
      <!-- 2 -->
      <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">
    
      <!-- Google Fonts -->
      <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Playfair+Display:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
    
      <!-- Vendor CSS Files -->
      <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
      <link href="assets/vendor/aos/aos.css" rel="stylesheet">
      <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
      <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
      <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
      <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
      <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
    
      <!-- Template Main CSS File -->
      <link href="assets/css/style2.css" rel="stylesheet">
      <link href="assets/css/profile.css" rel="stylesheet">
      
  
    </head>
    
  <body style="background-image: url('https://assets.cntraveller.in/photos/61fa89415dabee8b6de788ed/master/pass/valentines%20day%20restaurants%20mumbai%20lead.jpg');">
    
      <!-- ======= Top Bar ======= -->
      <div id="topbar" class="d-flex align-items-center fixed-top">
        <div class="container d-flex justify-content-center justify-content-md-between">
          
        </div>
      </div>
      
      
            <!-- Java Code  -->
      
      <%
         Connection connection = null;
         Statement statement = null;
		 String  loginId = (String) request.getAttribute("loginId");
		 String  dbAdmin = (String) request.getAttribute("loginId");
		 String  password = (String) request.getAttribute("loginId");

         		try {

         			Class.forName("com.mysql.cj.jdbc.Driver");
         			String url = "jdbc:mysql://localhost/poms";
         			connection = DriverManager.getConnection(url, dbAdmin, password);
         			statement = connection.createStatement();
         			ResultSet resultSet = statement
         					.executeQuery("select * from Customer where  email = '" + loginId + "'");
                    
         			while (resultSet.next()) {
         %>
            
      
      
      <!-- ------------------------------- -->
    
      <!-- ======= Header ======= -->
      <header id="header" class="fixed-top d-flex align-items-cente">
        <div class="container-fluid container-xl d-flex align-items-center justify-content-lg-between">
          <h1 class="logo me-auto me-lg-0"><a href="index.html">Welcome </a></h1>    
          <nav id="navbar" class="navbar order-last order-lg-0">
             <i class="bi bi-list mobile-nav-toggle"></i>
              <ul>
                <li><a class="nav-link scrollto " href="/">Home</a></li>
                <li><a class="nav-link scrollto" href="#about">About</a></li>
                <li><a class="nav-link scrollto" href="#menu">Menu</a></li>
                <li><a class="nav-link scrollto" href="#specials">Specials</a></li>
              </ul>
              <i class="bi bi-list mobile-nav-toggle"></i>
            <a href="#book-a-table" class="book-a-table-btn scrollto d-none d-lg-flex">Home</a>
      
          </nav>
        </div>
      </header><!-- End Header -->

   <!-- ======= Hero Section ======= -->
   <main id="main">
    <section class="breadcrumbs">

        <div class="container">
            <div class="main-body">
            
                  <!-- Breadcrumb -->
                  <nav aria-label="breadcrumb" class="main-breadcrumb">
                    <ol class="breadcrumb">
                      <li class="breadcrumb-item"><a href="index.html">Home</a></li>
                      <li class="breadcrumb-item"><a href="javascript:void(0)">User</a></li>
                      <li class="breadcrumb-item active" aria-current="page">User Profile</li>
                    </ol>
                    
                    <a href="#book-a-table" class="book-a-table-btn scrollto d-none d-lg-flex">Logout</a>
                  </nav><br/>
                  <!-- /Breadcrumb -->
            
                  <div class="row gutters-sm">
                    <div class="col-md-4 mb-3">
                      <div class="card">
                        <div class="card-body">
                          <div class="d-flex flex-column align-items-center text-center">
                            <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin" class="rounded-circle" width="150">
                            <div class="mt-3">
                              <%-- <h4><% out.println(resultSet.getString("Customer_name")); %></h4> --%>
                                <% out.println(resultSet.getString("Customer_name")); %>
                          
                              <p class="text-muted font-size-sm">
                               <% out.println(resultSet.getString("phone")); %>	
                              <%-- <% out.println(resultSet.getString("phone")); %> --%></p>

                              <a  href="update.jsp?login_id="><button class="btn">Update Profile</button></a>
                              <button class="btn">View Orders</button>
                            </div>
                          </div>
                        </div>
                      </div>


                    </div>
                    <div class="col-md-8">
                      <div class="card mb-3">
                        <div class="card-body">
                        
                          <div class="row">
                            <div class="col-sm-3">
                              <h6 class="mb-0">Full Name</h6>
                            </div>
                            <div class="col-sm-9 text-secondary">
                             <% out.println(resultSet.getString("Customer_name")); %>
                            </div>
                          </div>
                          <hr>
                          
                          <div class="row">
                            <div class="col-sm-3">
                              <h6 class="mb-0">Email</h6>
                            </div>
                            <div class="col-sm-9 text-secondary">
                             <% out.println(resultSet.getString("email")); %>
                            </div>
                          </div>
                          <hr>
                          <div class="row">
                            <div class="col-sm-3">
                              <h6 class="mb-0">Phone</h6>
                            </div>
                            <div class="col-sm-9 text-secondary">
                              (239) 816-9029
                            </div>
                          </div>
                          <hr>
                          
                          
                          <div class="row">
                            <div class="col-sm-3">
                              <h6 class="mb-0">Mobile</h6>
                            </div>
                            <div class="col-sm-9 text-secondary">
                              <% out.println(resultSet.getString("phone")); %>
                            </div>
                          </div>
                          <hr>
                          <div class="row">
                            <div class="col-sm-3">
                              <h6 class="mb-0">Address</h6>
                            </div>
                            <div class="col-sm-9 text-secondary">
                              <% out.println(resultSet.getString("address")); %>
                            </div>
                          </div>
                          <hr>

                    </div>
                  </div>
        
                </div>
            </div>
    </section>

   <% 
		}
          }catch(Exception e)
         	{
      		e.printStackTrace();
       		}
      %>

  
  </body>

    <!-- ======= Footer ======= -->
    <footer id="footer">
      <div class="footer-top">
        <div class="container">
          <div class="row">
  
            <div class="col-lg-3 col-md-6">
              <div class="footer-info">
                <h3>Restaurantly</h3>
                <p>
                  A108 Adam Street <br>
                  NY 535022, USA<br><br>
                  <strong>Phone:</strong> +1 5589 55488 55<br>
                  <strong>Email:</strong> info@example.com<br>
                </p>
                <div class="social-links mt-3">
                  <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
                  <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
                  <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
                  <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
                  <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
                </div>
              </div>
            </div>
  
            <div class="col-lg-2 col-md-6 footer-links">
              <h4>Useful Links</h4>
              <ul>
                <li><i class="bx bx-chevron-right"></i> <a href="#">Home</a></li>
                <li><i class="bx bx-chevron-right"></i> <a href="#">About us</a></li>
                <li><i class="bx bx-chevron-right"></i> <a href="#">Services</a></li>
                <li><i class="bx bx-chevron-right"></i> <a href="#">Terms of service</a></li>
                <li><i class="bx bx-chevron-right"></i> <a href="#">Privacy policy</a></li>
              </ul>
            </div>
  
            <div class="col-lg-3 col-md-6 footer-links">
              <h4>Our Services</h4>
              <ul>
                <li><i class="bx bx-chevron-right"></i> <a href="#">Web Design</a></li>
                <li><i class="bx bx-chevron-right"></i> <a href="#">Web Development</a></li>
                <li><i class="bx bx-chevron-right"></i> <a href="#">Product Management</a></li>
                <li><i class="bx bx-chevron-right"></i> <a href="#">Marketing</a></li>
                <li><i class="bx bx-chevron-right"></i> <a href="#">Graphic Design</a></li>
              </ul>
            </div>
  
            <div class="col-lg-4 col-md-6 footer-newsletter">
              <h4>Our Newsletter</h4>
              <p>Tamen quem nulla quae legam multos aute sint culpa legam noster magna</p>
              <form action="" method="post">
                <input type="email" name="email"><input type="submit" value="Subscribe">
              </form>
  
            </div>
  
          </div>
        </div>
      </div>
  
      <div class="container">
        <div class="copyright">
          &copy; Copyright <strong><span>Restaurantly</span></strong>. All Rights Reserved
        </div>

      </div>
    </footer><!-- End Footer -->
  
    <div id="preloader"></div>
    <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>
  
    <!-- Vendor JS Files -->
    <script src="assets/vendor/aos/aos.js"></script>
    <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
    <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
    <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
    <script src="assets/vendor/php-email-form/validate.js"></script>
  
    <!-- Template Main JS File -->
    <script src="assets/js/main.js"></script>

  </html>
  