	function retrieveSearchDetails()
	{
	var criteria = $("#criteria").val();
	var criteriaValue = $("#criteria-value").val();
	
	
	var screenName	= criteriaValue;
	var hashtag		= criteriaValue;
	
	if(criteria =="NA")
	{
		alert("Please select a criteria");
		$("#criteria").focus();
		return ;
	}
	if(criteria ==="")
	{
		alert("Please enter a criteria");
		$("#criteria").focus();
		return ;
	}
	if(criteria =="B"){
		
		hashtag  = $("#hashTag").val();

	}

	$('#loading').css("display","block");
	
	$.ajaxSetup({ cache:false });

	$.ajax({
			contentType: 'application/json',
			type	: "POST",
			url		: "fetchTweets",
			data: JSON.stringify({ "fetchType": criteria,
				'screenName'		:screenName,
				'hashtag'		:hashtag}),
			success:	function(show){
			var response = $.trim(show);
			$('#loading').css("display","none");
			$('#retrieve').css("display","block");
			$("#retrieve").html(response);
			},
			error: function(xhr,status,errorThrown){
			alert("No Search Details found !");
			} 
	});	
	
}
	

	