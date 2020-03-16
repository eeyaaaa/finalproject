
var bool=false;

	//submit활성화하는 함수 
	function confirmCheck(){
		bool = bool;
		
		console.log("submit함수 실행"+bool)
		if(bool){
			return true;
		}else{
			alert("필수 약관에 동의 해주세요.");
			return false;
		}
	}

	//아이디 중복확인	
	$("#emailCheck").click(function(){
		var email = $("#email").val();
		console.log("아이디 중복확인 email:"+email);
		ajax({
			url : "finalproject/join/emailCheck",
			type : "post",
			data : email,
			success : function(data){
				if(data == 0){
					alert("사용가능한 email입니다.")
				}else{
					alert("사용불가능한 email입니다.")
				}
			}
		});
		
	})
$( document ).ready( function() {
	
	/*모두동의 선택시 모든 체크박스 선택*/
	//만약 전체 선택 체크박스가 체크된상태일경우
	$("#checkAll").click(function(){		
		if($("#checkAll").prop("checked")) {
		$("input[type=checkbox]").prop("checked",true)
			} 
		// 전체선택 체크박스가 해제된 경우 
		else { 
			//해당화면에 모든 checkbox들의 체크를해제시킨다. 
			$("input[type=checkbox]").prop("checked",false); 
		} 
	}); 

	
	//[필수]체크박스 선택시 submit활성화 여부 (check box가 선택될때마다 확인)
	$('.check').click(function(){
		bool=submitOnf();
		
		if(bool){
			bool = true;
//			$(":input[type='submit']").removeAttr('disabled');
		}else{
			bool = false;
//			$(":input[type='submit']").attr('disabled','disabled');
		}
	})
	

	function submitOnf(){
		if($('#check1').prop("checked") && $('#check2').prop("checked")){
			console.log("true 리턴");
			return true;

		}else{
			console.log("false 리턴")
			return false;
		}
	}
})

