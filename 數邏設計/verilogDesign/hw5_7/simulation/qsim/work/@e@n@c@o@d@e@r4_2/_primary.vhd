library verilog;
use verilog.vl_types.all;
entity ENCODER4_2 is
    port(
        I               : in     vl_logic_vector(3 downto 0);
        A               : out    vl_logic;
        B               : out    vl_logic
    );
end ENCODER4_2;
