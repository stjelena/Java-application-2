# Java-application-2
An object in space is created with given integer coordinates of the center in two dimensions
space that can also be reached by color (Color). It is possible to change each of them individually
coordinate of the center for the specified displacement. It is possible to plot an object in space over a given one
graphic context (Graphics).
• A celestial body is an object in space that is created with an additional defined radius described
circles in pixels.
• A comet is a gray celestial body. It revolves around the center
plots as a regular pentagon with random orientation.
• Space is an active canvas with a black background
which contains an arbitrary number of celestial bodies. It is possible to add
celestial body. Every 100 milliseconds, the universe draws out all of them
contained celestial bodies, and then simulates movement through space so
which shifts the y-coordinate of all celestial bodies by 5 pixels.
It is possible to start and permanently end space activity.
• An active celestial body generator is created with a given universe. On the
every 900 milliseconds, the generator makes a comet whose x-coordinate of the center is a random value between 0 and 200, y-coordinate
center 0, and the radius of the described circle a random value
between 10 and 30, and then adds it to space. It is possible to launch i
permanently end generator activity.
• The simulator is the main application window with a width of 200 and a height of 400
of pixels that contains space, a panel with commands and a generator
heavenly bodies. The command panel contains a button with a label
"Start!". Pressing the "Launch!" button launches the universe and
celestial body generator, after which the button is disabled.
