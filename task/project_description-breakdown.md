## Network

- unique name
- different countries (Denmark)
- different regions (East Germany)
- contains all stations
- contains all their connections

Station:
- name (Copenhagen Central)
- connection between two stations is a “leg”

Leg:
- connects two stations
- can be navigated back and fourth
- defines distance in kilometers
- may carry a name, when multiple legs are available between same stations then it must

To-do:
- the already defined metamodel may violate well-formedness
- need means to define own Network
- import data from different format (GT) Model-To-Model
- Graphical notation


## Depot

- for each network different fleets of trains
- trains are stored in depot
- depot managers (DM) combine different coaches to form trains

Train:
- unique name (ICE121)
- regional or intercity
- layout is individual to each train, needs to be defined by DM

Coaches:
- three different types of coaches: Locomotive, Passenger Coach, Dining Coach
- each inner coach (not locomotive) carries a unique number

Locomotive:
- needs to be either first or last, can also be both
- color orange

Passenger coach:
- first (red) or second class (blue)
- a class needs to be in a sequence (no coaches of other class in between)
- no more than one sequence for each class per train
- intercity at least one first class

Dining coach:
- a train has at most one
- intercity at least one
- when both classes are present, needs to be in between
- color green

Visual editor:
- define and (ideally) modify trains within a depot with a visual editor
- create trains by placing coaches
- modify trains' names and coaches' numbers
- delete coaches
- must warn if rules are disobeyed
- (ideally) rearranging coaches via drap and drop
- coaches need to be viually expressive

## Schedule
- associates trains from one or many depots with a network by assigning traveling routes and departure times/frequencies
- subject to frequent changes
- textual scheduling language

Nice to have:
- An individual schedule uses a single network but can use trains from potentially many depots.
- Trains must be able to navigate through the stations of the network along routes where the route is
specific to a particular train schedule, e.g., there may be a train from Copenhagen to Aarhus going
directly but there may be another going via Odense.
- If there is only one leg connecting two stations, we do not want to be required to specify it explicitly (it
may not even have a name to reference). However, when there is more than one leg connecting the
same two stations, we must be able to specify which of the two legs should be taken.
- For each stop along the route, the platform number the train will arrive at/depart from has to be specifiable. Furthermore, a train stops for a number of minutes that must be specifiable for each
station along the route as well.
- At certain stations along the route, the train must turn due to the station’s track layout. We want to
manually mark the stops on a route that require a turn. However, when a route contains a turn, it must
be ensured that the train driving the route has a locomotive as leading and trailing coach.
- Train schedules are often repetitive so that a given train may drive the same route on different days at
the same time (e.g., Monday and Wednesday at 13:21) or on the same day at different time (e.g., Monday at 13:21 and 14:41). Further combinations of days and times are also possible for repeat schedules. We need a compact representation of these repeat schedules to not have to redefine too much of the respective route.

## Timetable

- shows:
  - arrivals and departures for a station
    - respective train
    - day of the week
    - time on that day
    - platform
  - arrival:
    - from which station train arrived
  - departure:
    - next station
- generated in system
- additionally represented in HTML

Information for a timetable:
- evaluate particular schedule
- regional trains drive an average 80 kph
- intercity trains drive an average 150 kph
- intercity with more than 8 coaches only 130 kph

When traveling from a station A to a station B, the arrival time at a station B is then calculated as the departure time at station A plus the travel time from station A to station B. In turn, the departure time at station B is calculated as the arrival time at station B plus the standing duration during that stop of the schedule
