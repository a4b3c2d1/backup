//$(function() {
//	var str = document.form_test.input_test.value;
//  	var data = str.split(',');
//
//  $('#search').autocomplete({
//    source: data,
//    autoFocus: true,
//    delay: 500,
//    minLength: 2
//  });
//});

$( function() {
    //console.time('timer1');
	var str = document.form_test.input_test.value;
  	var data = str.split(',');

    $( '#jquery-ui-autocomplete-input' ) . autocomplete( {
    	source: function(request, response) {
    	      response(
    	        $.grep(data, function(value){
    	          return value.indexOf(request.term) === 0;
    	        })
    	      );
    	},
    	autoFocus: true,
        delay: 300,
        minLength: 2
    } );

$(function() {
	  $('#jquery-ui-autocomplete-input').css({
		  'margin': '0',
		  'float': 'left',
		  'height': '24px',
		  'width' : '300px'
		  });
	});



} );
