$(document).ready(function () {
    $('#search').click(function (event) {
        let country = $('#country').val();
        $.post('users', {
            country : country,
            action: 'search'
        }, function (responseText) {
            $('#result').html(responseText);
        });
    })
});