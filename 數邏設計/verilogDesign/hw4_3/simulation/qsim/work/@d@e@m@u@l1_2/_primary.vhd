library verilog;
use verilog.vl_types.all;
entity DEMUL1_2 is
    port(
        DIN             : in     vl_logic;
        S               : in     vl_logic;
        Y               : out    vl_logic_vector(1 downto 0)
    );
end DEMUL1_2;
