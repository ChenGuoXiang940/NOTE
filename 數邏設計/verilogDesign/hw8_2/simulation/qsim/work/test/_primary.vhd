library verilog;
use verilog.vl_types.all;
entity test is
    port(
        CLK             : in     vl_logic;
        RESET           : in     vl_logic;
        SEGMENT         : out    vl_logic_vector(15 downto 0)
    );
end test;
