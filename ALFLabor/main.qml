import QtQuick 2.15
import QtQuick.Controls 2.15

ApplicationWindow {
    width: 640
    height: 480
    visible: true
    title: qsTr("Tabs")
    property int page4_bought: 0
    property int page5_bought: 0

    SwipeView {
        id: swipeView
        anchors.fill: parent
        currentIndex: 0


        Page1 {
            objectName: "page1Object"
        }

        Page2 {
            id: page2
            Page2Form {

            }

        }
        Page4 {
            id: page4
            Page4Form {
                buy_button1.onClicked: {
                    if(page2.subtitle !== "")
                    {
                        login_first = "";
                        page4_bought ++;
                        page6.title2 = (page4_bought +"db");
                        page6.title3 = (page5_bought +"db");


                    }
                    else
                    {
                        login_first = "Login first!";
                    }



                }
            }

        }
        Page5 {
            id: page5
            Page5Form {
                buy_button1.onClicked: {

                    if(page2.subtitle !== "")
                    {
                        login_first2 = "";
                        page5_bought ++;
                        page6.title2 = (page4_bought +"db");
                        page6.title3 = (page5_bought +"db");


                    }
                    else
                    {
                        login_first2 = "Login first!";
                    }

                }
            }
        }
        Page6 {
            id: page6
        }
    }

    Connections {
        target: networkManager
        onLoginSuccess: {
            swipeView.currentIndex = 1
            //page2.title = title
            page2.subtitle = subtitle
        }

    }

}
