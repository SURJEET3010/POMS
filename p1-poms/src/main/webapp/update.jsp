<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
    
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Receptionist</title>


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
          <link href="assets/css/style.css" rel="stylesheet">
    
</head>
<body style="background-image: url('https://cdn.pixabay.com/photo/2016/11/18/14/05/brick-wall-1834784_960_720.jpg'); background-repeat: no-repeat; background-size: cover;">

  <!-- ======= Top Bar ======= -->
  <div id="topbar" class="d-flex align-items-center fixed-top">
    <div class="container d-flex justify-content-center justify-content-md-between">
      
    </div>
  </div>

  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top d-flex align-items-cente">
    <div class="container-fluid container-xl d-flex align-items-center justify-content-lg-between">
      <h1 class="logo me-auto me-lg-0"><a href="index.html"> Update your profile</a></h1>    
      <nav id="navbar" class="navbar order-last order-lg-0">
         <i class="bi bi-list mobile-nav-toggle"></i>
      </nav>
    </div>
  </header><!-- End Header -->
  
    
    
    <section id="adminPage" class="d-flex align-items-center">
        <div class="adminPage">
          <!-- <img src="img_snow.jpg" alt="Snow"> -->
          <div class="adminWork" style="margin-top: 30%;" id="adm">
          <form action="CustomerUpdate" method="post">
          					<%-- <h2><%=request.getParameter("login_id")%></h2> --%>
                             <div style={align:center;}>
                               <label for="Name" class="float-left">Full Name</label>
                               <input type="text" name = "name" class="form-control w-50" value="Surjeet"><br>
                             </div>
                             
                             <div>
                               <label for="Email" class="float-left">Email</label>
                               <input type="email" name = "email" class="form-control w-50" value="surjeet672hmail.com"><br>
                             </div>
                              <div>
                                <label for="Number" class="float-left">Contact Number</label>
                                <input type="tel" name = "phone" class="form-control w-50" placeholder="9090909090"><br>
                              </div>
                               <div>
                                 <label for="address" class="float-left">Address</label>
                                 <input type="text" name = "address" class="form-control w-50" value="lucknow"><br>
                               </div>
                                 <div>
                                 <label for="dob" class="float-left">DOB</label>
                                 <input type="text" name = "dob" class="form-control w-50" value="10/02/2000"><br>
                               </div>
                            

       
                          <div>
                             <a  href="customer.jsp" type="button" class="btnAdm">Submit </a>
                             <!-- <button type="submit" class="btnAdm">Cancel</button> -->
                          </div>
                        
                         </div>
                    </form>
                    

                    
                    
                 

          </div>
        </div>
        <div class="row">
          <div class="col-lg-4 d-flex align-items-center justify-content-center position-relative" data-aos="zoom-in" data-aos-delay="200">
           
          </div>
        </div>  
       
      </section><!-- End Hero -->

      
    
    
</body>
</html>