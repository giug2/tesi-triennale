
(function($) { "use strict";
	$(function() {
		var header = $(".start-style");
		$(window).scroll(function() {    
			var scroll = $(window).scrollTop();
			if (scroll >= 10) {
				header.removeClass('start-style').addClass("scroll-on");
			} else {
				header.removeClass("scroll-on").addClass('start-style');
			}
		});
	});		
		
	//Animazione hero
	$(document).ready(function() {
		$('section.hero-anime').removeClass('hero-anime');
	});

	//Menu On Hover
	$('section').on('mouseenter mouseleave','.nav-item',function(e){
			if ($(window).width() > 750) {
				var _d=$(e.target).closest('.nav-item');_d.addClass('show');
				setTimeout(function(){
				_d[_d.is(':hover')?'addClass':'removeClass']('show');
				},1);
			}
	});	
})(jQuery); 



window.addEventListener('load', function() {
	// setTimeout to simulate the delay from a real page load
	setTimeout(lazyLoad, 1000);
});

function lazyLoad() {
	var images = document.querySelectorAll('.image');
	
	// loop over each card image
	images.forEach(function(image) {
		//var image_url = image.getAttribute('data-image-full');
		var content_image = image.querySelector('img');
		
		// change the src of the content image to load the new high res photo
		content_image.src = image_url;
		
		// listen for load event when the new photo is finished loading
		content_image.addEventListener('load', function() {
			// swap out the visible background image with the new fully downloaded photo
			card_image.style.backgroundImage = 'url(' + image_url + ')';
			// add a class to remove the blur filter to smoothly transition the image change
			card_image.className = card_image.className + ' is-loaded';
		});
		
	});
	
}

window.addEventListener('scroll', reveal);

function reveal(){
	var reveals = document.querySelectorAll('.reveal');
	for (var i=0; i<reveals.length; i++){
		var windowheight = window.innerHeight;
		var revealtop = reveals[i].getBoundingClientRect().top;
		var revealpoint = 150;
		
		if(revealtop < windowheight - revealpoint){
			reveals[i].classList.add('active');
		}
		else{
			reveals[i].classList.remove('active');
		}
	}
}

/*
$("#elem").scroll(function(){
	$.ajax({
		type: "GET",
		url: "index.html",
		data: "request=animal",
		dataType: "html",
		success: function(data){
			JSON.parse(data);
		},
		error: function(){
			alert("Error!");
		}
	});
}); */
