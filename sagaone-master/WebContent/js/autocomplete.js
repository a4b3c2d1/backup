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
		  'box-sizing': 'content-box',
		  'margin': '0',
		  'float': 'left',
		  'height': '28px',
		  'width' : '300px',
		  'border': 'none'
		  });
	});

$(function() {
	  $('.ui-autocomplete').css({
		'max-height': '90px',
	    'overflow-y': 'auto',
	    'overflow-x': 'hidden',
	    'padding-right': '20px',
	    'border-radius': '0px',
	    'font-size': '12px'
		  });
	});

$(function() {
	  $('#jquery-ui-autocomplete label').css({
		'float': 'left',
	  	'margin-right': '0.5em',
	  	'color': 'black',
	  	'font-size': '15px'

		  });
	});

} );
