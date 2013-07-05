/* PhoneGap plugin constructors */

// Share
cordova.define("cordova/plugin/share", function (require, exports, module) {
    var exec = require("cordova/exec");
	module.exports = {
        show: function (message, win, fail) {
			exec(win, fail, "Share", "show", [message]);
		}
    };
});

// Toasts
cordova.define("cordova/plugin/toasts", function (require, exports, module) {
    var exec = require("cordova/exec");
	module.exports = {
        showShort: function (message, win, fail) {
            exec(win, fail, "Toasts", "show_short", [message]);
        },
        showLong: function (message, win, fail) {
            exec(win, fail, "Toasts", "show_long", [message]);
        },
        cancel: function (win, fail) {
            exec(win, fail, "Toasts", "cancel", []);
        }
    };
});
/* END PhoneGap constructors */