import QtQuick 2.15
import QtQuick.Controls 2.15

Item {
    id: item1

    //width: 600
    //height: 400
    property alias title2: title2.text
    property alias title3: title3.text



    Label {
        id: title
        x: 56
        y: 0
        text: qsTr("Két Medve4")
        anchors.topMargin: 13
        font.pointSize: 40
        anchors.leftMargin: -273
    }
    Label {
        id: title2
        x: 498
        y: 0
        text: qsTr("0db")
        anchors.topMargin: 13
        font.pointSize: 40
        anchors.leftMargin: -273
    }

    Label {
        id: title1
        x: 56
        y: 110
        text: qsTr("Két Medve5")
        anchors.leftMargin: -273
        anchors.topMargin: 13
        font.pointSize: 40
    }

    Label {
        id: title3
        x: 498
        y: 110
        text: qsTr("0db")
        anchors.leftMargin: -273
        anchors.topMargin: 13
        font.pointSize: 40
    }
}

/*##^##
Designer {
    D{i:0;autoSize:true;height:480;width:640}
}
##^##*/

