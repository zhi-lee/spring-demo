define('components/layout', ['jquery'], function ($) {
    $.fn.extend({
        sidebarMenu: (settings) => {

        }
    });
    $.namespace('mana.layout.nav');
    mana.layout.nav = (() => {
        return () => console.log('Build nav');
    })();
    $.namespace('mana.layout.menu');
    mana.layout.menu = (() => {
        return () => console.log('Build menu');
    })();

    $.namespace('mana.layout.content');
    mana.layout.content = (() => {
        return () => console.log('Build content');
    })();

    $.namespace('mana.layout.footer');
    mana.layout.footer = (() => {
        return () => console.log('Build footer');
    })();
    return () => {
        $.each(mana.layout, (k, v) => v.call())
    };
});