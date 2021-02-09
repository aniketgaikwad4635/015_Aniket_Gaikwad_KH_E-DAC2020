

jQuery(document).ready(function(jQuery){
      jQuery("h1").click(function(){
          alert("single click on h1 element");
      });
});
jQuery(document).ready(function(jQuery){
    jQuery("p").dblclick(function(){
        alert("double click on p element");
    });
});