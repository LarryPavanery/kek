(function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  var Unit = Kotlin.kotlin.Unit;
  function main$lambda(f, res) {
    res.type('text/plain');
    return res.send('Hello KEK!');
  }
  function main$lambda_0() {
    println('Listening on port 3000');
    return Unit;
  }
  function main(args) {
    println('Hello KEK!');
    var express = require('express');
    var app = express();
    app.get('/', main$lambda);
    app.listen(3000, main$lambda_0);
  }
  _.main_kand9s$ = main;
  main([]);
  Kotlin.defineModule('kek', _);
  return _;
}(module.exports, require('kotlin')));

//# sourceMappingURL=kek.js.map
