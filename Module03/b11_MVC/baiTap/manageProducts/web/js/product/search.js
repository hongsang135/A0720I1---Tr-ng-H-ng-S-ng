$(document).ready(function() {
    $('#search').click(function(event) {
        let name = $('#name').val();
        $.post('products', {
            name : name,
            action : "search"
        }, function(responseText) {
            // if (responseText == "Not Found") {
            //     $('#result').html(responseText);
            // } else {
            $('#result').html(responseText);
            // }
        });
    });
});