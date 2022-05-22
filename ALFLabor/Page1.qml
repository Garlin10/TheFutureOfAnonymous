import QtQuick 2.4

Page1Form {
    signal loginPressed(var username, var password);
    signal registerPressed(var username, var password);

    button.onClicked: {
        loginPressed(username, password)


    }
    button1.onClicked: {
        registerPressed(username, password)


    }
}
