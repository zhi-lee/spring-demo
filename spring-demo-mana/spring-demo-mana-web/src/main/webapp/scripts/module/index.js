define('module/index', ['jquery', 'components/ajax'], function ($, ajax) {
    'use strict'
    $.namespace('mana.index.init');
    mana.index.init = (() => {
        return () => console.log('mana.index.init');
    })();
    return () => {
        $.each(mana.index, (k, v) => v.call())
    };
});