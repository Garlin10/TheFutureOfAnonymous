import QtQuick 2.15
import QtQuick.Controls 2.15

Item {
    id: item1

    //width: 600
    //height: 400
    //property alias title: title.text
    property alias subtitle: subtitle.text
    //property alias imageSource: image.source
    property alias login_first: login_first.text

    Label {
        id: title
        x: 126
        y: 100
        text: qsTr("Felhasználó:")
        anchors.topMargin: 2
        font.pointSize: 55
        anchors.leftMargin: -273
    }

    Label {
        id: subtitle
        x: 173
        text: qsTr("")
        anchors.top: title.bottom
        font.pointSize: 33

    }

    Label {
        id: login_first
        text: myTextInput.text
        anchors.top: buy_button1.bottom
        x: 270
        y: 351
        color: "#ff0000"
        font.pixelSize: 12
        scale: 2.121
        anchors.topMargin: 15
    }
}

/*##^##
Designer {
    D{i:0;autoSize:true;height:480;width:640}
}
##^##*/

