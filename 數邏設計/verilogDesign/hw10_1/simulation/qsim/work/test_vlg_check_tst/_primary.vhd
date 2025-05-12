library verilog;
use verilog.vl_types.all;
entity test_vlg_check_tst is
    port(
        Large           : in     vl_logic_vector(7 downto 0);
        Middle          : in     vl_logic_vector(7 downto 0);
        Small           : in     vl_logic_vector(7 downto 0);
        sampler_rx      : in     vl_logic
    );
end test_vlg_check_tst;
