import { expect } from 'chai';
import { shallowMount } from '@vue/test-utils';
import Register from '@/views/Register.vue';

describe('Register.vue', () => {
  it('includes Username and Password fields', () => {
    const wrapper = shallowMount(Register);
    expect(wrapper.text()).to.include('Username');
    expect(wrapper.text()).to.include('Password');
    expect(wrapper.text()).to.include('Repeat Password');
  });
});
