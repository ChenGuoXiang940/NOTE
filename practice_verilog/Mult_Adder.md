
# Entity: Mult_Adder 
- **File**: Mult_Adder.v

## Diagram
![Diagram](Mult_Adder.svg "Diagram")
## Ports

| Port name | Direction | Type  | Description |
| --------- | --------- | ----- | ----------- |
| in1       | input     | [3:0] |             |
| in2       | input     | [3:0] |             |
| out1      | output    | [4:0] |             |

## Signals

| Name   | Type       | Description |
| ------ | ---------- | ----------- |
| carry1 | wire [3:0] |             |

## Instantiations

- adder1: adder
- adder2: adder
- adder3: adder
- adder4: adder
