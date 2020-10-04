<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<title>Twitter Fetch App</title>
    	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    	<link href="/css/custom.css" rel="stylesheet">	    	
    </head>	
	<body>      
		<form method="post"  enctype="multipart/form-data" name="form" id="form"> 
		<div class="wrapper">
			<header class="main-head" >
			<div  align="center">
			</div>	
			<div class="heading" style="margin-top:.01em;margin-left: 29%;">Tweet Fetcher</div>
			<div style="margin-top:.5em;" align="center">
			</div>	
			<div style="margin-top:.5em;" align="center">
			</div>
			</header>
			<article class="content">
				<div style= "margin:0 auto;margin-top: 3.5em;">				
				<div class="grid-search-box rounded border uk-margin uk-card uk-card-hover" >
				<div class="div-header"></div>
					<div class="div-1" style="text-align:right;">
						<p>Search By : </p>
					</div>
					<div class="div-2">
						<select id= "criteria" class= "select-css" style= "margin: auto;" >

							<option value="NA" disabled="disabled" >Select search criteria</option>
							<option class="select-option" value="F" selected="selected">Followers</option>
							<option class="select-option" value="H" >Hash Tag</option>
							<option class="select-option" value="B">Followers and Hash Tag</option>

						</select>
					</div>
					<div class="div-3">
						<input id= "criteria-value" type="text" placeholder="Search criteria">
						<div id="div-hashtag"><input id= "hashTag" type="text" placeholder="Hashtag" >
						</div>
						
					</div>
					<div class="div-4">
						  <a href="#" class="button"  onclick="javascript: retrieveSearchDetails();">Search</a>
					</div>						
				</div>
 
				<div id="retrieve">
				</div>
				</div>
				<div class="footer"></div>	
			</article> 	
		</div>				
		</form>
		<script src="/js/custom.js"></script>
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>	
        <script>
        

    	$( document ).ajaxComplete(function() {
    		
    		var listElement = $('#pageStuff');
    		var perPage = 10; 
    		var numItems = listElement.children().size();
    		var numPages = Math.ceil(numItems/perPage);

    		$('.pager').data("curr",0);

    		var curr = 0;
    		while(numPages > curr){
    		  $('<li><a href="#" class="page_link">'+(curr+1)+'</a></li>').appendTo('.pager');
    		  curr++;
    		}

    		$('.pager .page_link:first').addClass('active');

    		listElement.children().css('display', 'none');
    		listElement.children().slice(0, perPage).css('display', 'block');

    		$('.pager li a').click(function(){
    		  var clickedPage = $(this).html().valueOf() - 1;
    		  goTo(clickedPage,perPage);
    		});

    		function previous(){
    		  var goToPage = parseInt($('.pager').data("curr")) - 1;
    		  if($('.active').prev('.page_link').length==true){
    		    goTo(goToPage);
    		  }
    		}

    		function next(){
    		  goToPage = parseInt($('.pager').data("curr")) + 1;
    		  if($('.active_page').next('.page_link').length==true){
    		    goTo(goToPage);
    		  }
    		}

    		function goTo(page){
    		  var startAt = page * perPage,
    		    endOn = startAt + perPage;
    		  
    		  listElement.children().css('display','none').slice(startAt, endOn).css('display','block');
    		  $('.pager').attr("curr",page);
    		}
    		});
    	
        $(function() {
            $('#div-hashtag').hide(); 
            $('#criteria').change(function(){
                if($('#criteria').val() == 'B') {
                    $('#div-hashtag').show(); 
                    $('#criteria-value').attr("placeholder", "Follower Name");

                } else {
                    $('#criteria-value').attr("placeholder", "Search criteria");
                    $('#div-hashtag').hide(); 
                } 
            });
        });
        
    	</script>
	</body>
</html>
