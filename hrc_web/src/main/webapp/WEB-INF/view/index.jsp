<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css">
<title>HRC 출석</title>

<script type="text/javascript">

function attendOnlyName(){
	
	if($("#runner_name").val() == null || $("#runner_name").val() == ""){
		$.alert("이름입력");
	}
	
	var sendData = {
		runnerName : $("#runner_name").val() 
	};
	
	$.ajax({
	  type: "POST",
	  url: "attendByName", 
	  data: JSON.stringify(sendData),
	  dataType : 'json',
	  contentType : 'application/json; charset=UTF-8',
	  success: function(res){
		alert(res);  
	  }  
	});  
}

</script>
</head>
<body>
	<div class="container">
		<form>
			<div class="col-12" style="text-align: center"><p class="font-weight-bold">HRC 출석</p></div>
			<div class="container-fluid">
				<div class="row">
					<div class="col-3">
						<label for="runner_name">Name</label>
					</div>
				
					<div class="form-group col-9">
						<input type="text" class="form-control" id="runner_name" placeholder="이름을 입력해주세요.">
					</div>
				</div>		
				<div class="row" id="div-birthday" style="display: none;">
					<div class="col-3">
						<label for="birthday">Birthday</label>
					</div>
					<div class="form-group col-9">
						<input type="date" class="birthday" id="birthday">
					</div>
				</div>
				<div class="row">
					<div class="col-12" style="text-align: center">
					<button class="btn btn-primary" onclick="attendOnlyName()">출석체크</button>
				</div>
			</div>
		</form>

	</div>
	<script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
	<script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>