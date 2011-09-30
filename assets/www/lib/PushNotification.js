var PushNotification = {
    registerCallback: function(successCallback, failureCallback) {
        return PhoneGap.exec(
               successCallback,           // called when signature capture is successful
               failureCallback,           // called when signature capture encounters an error
               'PushNotificationPlugin',  // Tell PhoneGap that we want to run "PushNotificationPlugin"
               'registerCallback',        // Tell the plugin the action we want to perform
               []);                       // List of arguments to the plugin
    },
    notificationCallback: function(json) {
        var data = window.JSON.parse(json);
        alert("Success: " +  data.msg);
    }
};

PhoneGap.addConstructor(function() {
    PhoneGap.addPlugin("pushNotification", PushNotification);
});
