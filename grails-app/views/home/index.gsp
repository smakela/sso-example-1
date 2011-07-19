<html>
    <head>
        <title>SSO Example 1</title>
    </head>
    <body>
        Hello <sec:loggedInUserInfo field="username"/> to SSO Example 1!<br>
        <g:link controller='logout' action='index'>Logout</g:link>
    </body>
</html>