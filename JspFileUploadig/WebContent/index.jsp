<%@include file="jsp/header.jsp" %>
 <div class="container1" >
 
 </div>
  <div class="container1" >
<center>
<h1>Upload File Form</h1>
<form action="FileUploadHandler" enctype="multipart/form-data" method="post">
             Enter File Name <input type="text" name="file_name"><br><br><br> 
              Select file:
				 <input type="file" name="file2" /><br><br><br>
				 <hr>
               <input type="submit" value="Upload" />
           </form>  
           </center>
           </div>
           
           <center>
           <%
 			String file_name=(String)request.getParameter("filename");
 			if(file_name!=null){
 			out.println(file_name+" File uploaded successfuly");
 }
 %>          </center>
         



   
           
<%@include file="jsp/footer.jsp" %>
