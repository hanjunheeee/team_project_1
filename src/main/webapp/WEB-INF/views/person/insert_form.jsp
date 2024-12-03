<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<script>
			function send1(f) {
				let name = f.name.value;
				//유효성 체크
				if(name === ''){
					alert("이름을 입력하세요");
					return;
				}
				f.action = "insert_single.do";
				f.method = "post";
				f.submit();
			}	
			function send2(f){
				f.action="insert_vo.do";
				f.method = "post";
				f.submit();
			}
		</script>
	
	</head>
	<body>
		<form>
			<table border="1">
				<tr>
					<th>이름</th>
					<td><input name="name"></td>
				</tr>
				
				<tr>
					<th>나이</th>
					<td><input name="age"></td>
				</tr>
				
				<tr>
					<th>전화번호</th>
					<td><input name="tel"></td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="낱개로 전송"
							onclick="send1(this.form);"> 
						<input type="button" value="객체로 전송"
							onclick="send2(this.form);"> 
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>



