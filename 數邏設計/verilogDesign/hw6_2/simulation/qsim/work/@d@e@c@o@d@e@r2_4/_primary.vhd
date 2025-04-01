library verilog;
use verilog.vl_types.all;
entity DECODER2_4 is
    port(
        A               : in     vl_logic;
        B               : in     vl_logic;
        Y               : out    vl_logic_vector(3 downto 0)
    );
end DECODER2_4;
