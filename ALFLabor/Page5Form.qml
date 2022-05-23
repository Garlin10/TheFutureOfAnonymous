import QtQuick 2.15
import QtQuick.Controls 2.15

Item {
    id: item1

    //width: 600
    //height: 400
    property alias title: title.text
    property alias subtitle: subtitle.text
    property alias imageSource: image.source
    property alias buy_button1: buy_button1
    property alias login_first2: login_first2.text

    Image {
        id: image
        x: 220
        width: 200
        height: 200
        anchors.top: subtitle.bottom
        source: "assets/img/blog/img5.jpg"
        anchors.leftMargin: 220
        anchors.topMargin: 14
        fillMode: Image.PreserveAspectFit
    }

    Label {
        id: title
        x: 148
        y: 0
        text: qsTr("Két Medve 2")
        anchors.topMargin: 13
        font.pointSize: 55
        anchors.leftMargin: -273
    }

    Label {
        id: subtitle
        x: 235
        text: qsTr("Varga B.")
        anchors.top: title.bottom
        font.pointSize: 33
        anchors.leftMargin: -186
        anchors.topMargin: 21
    }

    Button {
        id: buy_button1
        anchors.top: image.bottom
        x: 288
        y: 401
        text: qsTr("Buy")
    }

    Label {
        id: login_first2
        text: "";
        anchors.top: buy_button1.bottom
        x: 303
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

