library verilog;
use verilog.vl_types.all;
entity test is
    port(
        CLK             : in     vl_logic;
        RESET           : in     vl_logic;
        Q               : out    vl_logic_vector(4 downto 0)
    );
end test;
