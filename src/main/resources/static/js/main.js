$(document).ready(function (){
    console.log('ready');
    $('#user-list .edit-btn').on('click', function (event) {
        event.preventDefault();
        console.log(event);
        $('#edit-user').modal();

        var href = $(this).attr('data-url');
        $.get(`/get`, function (user, status) {
            $('#edit-user #id').val(user.id);
            $('#edit-user #username').val(user.name);
            $('#edit-user #password').val(user.password);
            $('#edit-user #firstName').val(user.firstName);
            $('#edit-user #lastName').val(user.lastName);
            $('#edit-user #age').val(user.age);
            $('#edit-user #roles').val(user.roles);
        });
    });









    $('.new-btn').on('click', function (event){
        event.preventDefault();
        var href = $(this).attr('href');
        var text = $(this).text();

        if(text=='Edit') {

        } else {
            $('.edit-user #id').val('');
            $('.edit-user #username').val('');
            $('.edit-user #password').val('');
            $('.edit-user #firstName').val('');
            $('.edit-user #lastName').val('');
            $('.edit-user #age').val('');
            $('.edit-user #roles').val('');
            $('.edit-user #exampleModal').modal();
        }
    });


    $('.table .delete-btn').on('click', function (event){
        event.preventDefault();
        var href = $(this).attr('href');
        $('#myModal #delRef').attr('href', href);
        $('#myModal').modal();
    });

});