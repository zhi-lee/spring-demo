define('module/login', ['jquery', 'components/ajax'], function ($, ajax) {
    'use strict'
    $.namespace('mana.security.login');
    mana.security.login = (() => {
        return () => ajax({url: '/req'});
    })();

    $.namespace('mana.security.initPage');
    mana.security.initPage = (() => {
        return () => {
            var windowHeight =
                window.innerHeight
                || (document.body && document.body.clientHeight), container = $('.wrap-container').height();
            if (document.documentElement
                && document.documentElement.clientHeight) {
                windowHeight = document.documentElement.clientHeight;
            }
            console.log(windowHeight);
        }
    })();
    return () => {
        $.each(mana.security, (k, v) => v.call())
    };
});