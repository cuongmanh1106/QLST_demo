<footer>
        						<div class="container-fluid">

        							<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
        								<div class="map">
        									<h2>watermelon</h2>
        									<div>
        										<p><strong>Address</strong></p>
        										<p>97 Man Thien Street, District 9, HCMC</p>
        										<p><strong>Phone</strong></p>
        										<p> 028 - 1234 - 567</p>
        										<p><strong>E-mail</strong></p>
        										<p>watermelon@gmail.com</p>
        									</div>
        								</div>
        							</div>

        							<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
        								<div class="map">
        									<h2>Blog</h2>
        									<div>
        										<p><strong>How to get the promotion?</strong></p>
        										<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        										<p><strong>Fresh - Cheap - Tasty</strong></p>
        										<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>

        									</div>
        								</div>
        							</div>

        							<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
        								<div class="form-group signup">
        									<b>Email: </b><input type="email" id="email" class="form-control"><br>
        									<b>Password: </b><input type="password" class="form-control" id="pass"></div>
        									<button type="submit" class="btn-signup" onclick="signup();">Sign up</button>
        								</div>
        							</div>
        							<p style="text-align: center; margin-top: 20px; font-size: 12px; color: #333">Copyright &copy; 2017 All rights reserved by watermelon </p> 
        						</div>
        					</footer>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="public_main/js/bootstrap.js"></script>
<script defer src="public_main/js/jquery.flexslider.js"></script>
<link rel="stylesheet" href="public_main/css/flexslider.css" type="text/css" media="screen" />
<script>
// Can also be used with $(document).ready()
$(window).load(function() {
  $('.flexslider').flexslider({
    animation: "slide",
    controlNav: "thumbnails"
  });
});
</script>
<script>
	document.addEventListener('DOMContentLoaded', function(){
		let wrapper = document.getElementById('wrapper');
		let topLayer = wrapper.querySelector('.top');
		let handle = wrapper.querySelector('.handle');
		let skew = 0;
		let delta = 0;

		if(wrapper.className.indexOf('skewed') != -1){
			skew = 1000;
		}

		wrapper.addEventListener('mousemove', function(e){
			delta = (e.clientX - window.innerWidth / 2) * 0.5;

			handle.style.left = e.clientX + delta + 'px';

			topLayer.style.width= e.clientX + skew + delta + 'px';
		});
	});

	function signup(){
		var email = document.getElementById("email").value;
		var pass = document.getElementById("email").value;

		if(email == "" || pass == ""){
			alert("Please fill in!");
		}
	}
</script>


<script>
	var slideIndex = 0;
	showSlides();

	function showSlides() {
		var i;
		var slides = document.getElementsByClassName("mySlides");
		var dots = document.getElementsByClassName("dot");
		for (i = 0; i < slides.length; i++) {
			slides[i].style.display = "none";  
		}
		slideIndex++;
		if (slideIndex > slides.length) {slideIndex = 1}    
			for (i = 0; i < dots.length; i++) {
				dots[i].className = dots[i].className.replace(" active", "");
			}
			slides[slideIndex-1].style.display = "block";  
			dots[slideIndex-1].className += " active";
    setTimeout(showSlides, 2000); // Change image every 2 seconds
}
</script>

<script>
    function myFunction() {
        var x = document.getElementById("myTopnav");
        if (x.className === "topnav") {
            x.className += " responsive";
        } else {
            x.className = "topnav";
        }
    }
</script>
</body>
</html>