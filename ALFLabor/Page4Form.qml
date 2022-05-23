import QtQuick 2.15
import QtQuick.Controls 2.15

Item {
    id: item1

    //width: 600
    //height: 400
    property alias title4: title4.text
    property alias subtitle4: subtitle4.text
    property alias imageSource: image.source
    property alias buy_button1: buy_button1
    property alias login_first: login_first.text

    Image {
        id: image
        x: 215
        y: 159
        width: 200
        height: 200
        anchors.top: subtitle.bottom
        source: "assets/img/blog/img5.jpg"
        anchors.leftMargin: 220
        anchors.topMargin: 14
        fillMode: Image.PreserveAspectFit
    }

    Label {
        id: title4
        x: 148
        y: 0
        text: qsTr("Két Medve1")
        anchors.topMargin: 13
        font.pointSize: 55
        anchors.leftMargin: -273
    }

    Label {
        id: subtitle4
        x: 235
        y: 113
        text: qsTr("Gál Gy.")
        anchors.top: title.bottom
        font.pointSize: 33
        anchors.leftMargin: -186
        anchors.topMargin: 21
    }

    Button {
        id: buy_button1
        anchors.top: image.bottom
        anchors.topMargin: -12
        x: 283
        y: 401
        text: qsTr("Buy")
    }

    Label {
        id: login_first
        text: myTextInput.text
        anchors.top: buy_button1.bottom
        x: 264
        y: 449
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

