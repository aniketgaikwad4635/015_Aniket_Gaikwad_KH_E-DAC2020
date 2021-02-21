<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="common-css-js.jsp" %>
<jsp:include page="common-header.jsp"></jsp:include>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="d-flex flex-column justify-content-center align-items-center" style="height:400px">
     <div>
            <h3>ALBUM</h3>
     </div>
    <div class="row justify-content-center mt-4" >
           <div class="col-6" style="text-align:center">
           Something short and leading about the collection below—its contents, the creator, etc. Make it short and sweet, but not too short so folks don’t simply skip over it entirely.
           </div>
            
    </div>
    <div class="row mt-4">
           <button class="btn btn-sm btn-secondary mr-3"> Main action</button>
            <button class="btn btn-sm btn-secondary mr-3"> Last action</button>
    </div>

</div>

<div class="d-flex justify-content-center">
<div class="col-11">
    <div class="row">
      <c:forEach begin="0" end="12">    
      <div class="card col-4" style="height:400px">
           <img src="https://picsum.photos/200/300" class="card-img-top" style="height:200px; object-fit:cover"></img>
          <div class="card-body">
             <div class="card-title">
                     Image
             </div>
             <div class="card-text">
                    This images are taken  from online website picsum
             </div>
             
          </div>     
      </div>
      
      </c:forEach> 
      </div>
</div>
</div>





</body>
</html>