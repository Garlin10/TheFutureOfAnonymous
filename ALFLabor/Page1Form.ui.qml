import QtQuick 2.15
import QtQuick.Controls 2.15
import QtQuick.Layouts 6.0

Item {
    id: item1

    //width: 600
    //height: 400
    property alias button: button
    property alias username: userNameTextField.text
    property alias password: passwordTextField.text
    property alias button1: button1

    Image {
        id: image
        x: 170
        y: 8
        width: 300
        height: 121
        horizontalAlignment: Image.AlignHCenter
        verticalAlignment: Image.AlignVCenter
        source: "assets/img/logo-bme-aut.png"
        fillMode: Image.PreserveAspectFit
    }
    ColumnLayout {
        id: column
        y: 177
        width: 250
        height: 100
        anchors.top: label.bottom
        layoutDirection: Qt.LeftToRight
        anchors.horizontalCenterOffset: 0
        anchors.horizontalCenter: parent.horizontalCenter
        anchors.topMargin: 50

        Label {
            id: label1
            text: qsTr("User name")
        }

        TextField {
            id: userNameTextField
            placeholderText: qsTr("Text Field")
        }

        Label {
            id: label2
            text: qsTr("Password")
        }

        TextField {
            echoMode: TextInput.Password
            id: passwordTextField
            placeholderText: qsTr("Text Field")
        }

        Button {
            id: button
            text: qsTr("Login")
            Layout.alignment: Qt.AlignHCenter | Qt.AlignVCenter
        }

        Button {
            id: button1
            text: qsTr("Sign up")
            Layout.alignment: Qt.AlignHCenter | Qt.AlignVCenter
        }
    }
}

/*##^##
Designer {
    D{i:0;autoSize:true;height:480;width:640}
}
##^##*/

