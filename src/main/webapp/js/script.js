$(document).ready(function() {
  var table= $('#tableStudent').DataTable( {
    	
    	"ajax": {
                "url": "/allStudents",
                "dataSrc": ""
           }, 
           "dataType":"json",
    	"columns": [
    	         { "data": "idstudent" },
    	         { "data": "name" },
    	         { "data": "faculty" },
    	         { "data": "year" },
    	         { "data": "profil" },
    	         { "defaultContent":"<button>Details</button>"}
    	            
    	 ]    	         
       
    });
  
  
  $('#tableStudent tbody').on( 'click', 'button', function () {
	  $.ajax({
		  type: 'GET',
	        	url: '/allStudents',
	        	dataType: 'json'
	        		
	  		,
	        success: function(data){
	        	for(var i in data)
	        	{
	        		/*var modalData = "<h3>Student Name :</h3></p><p>"+data[i].name+"</p>";
	        		modalData = modalData +"<h3>Student faculty :</h3></p><p>"+data[i].faculty+"</p>";
	        		 $("#myModal .modal-body").html(modalData);
	        		 
*/	                $("#myModal #studentname").html(data[i].name);
					$("#myModal #studentfaculty").html(data[i].faculty);
	        		$("#myModal").modal('show');
	        		
	        	}
	        }
	  })
  });
});